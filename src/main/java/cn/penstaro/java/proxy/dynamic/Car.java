package cn.penstaro.java.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author: Penstaro
 * @date: 2022/3/11
 * @Description:
 **/
public class Car implements Movable{
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run run run....");
    }

    public static void main(String[] args) {
        Movable movable = (Movable)Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Movable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();
                System.out.println("log start");
                Car car = new Car();
                method.invoke(car,args);
                System.out.println("log end");
                long end = System.currentTimeMillis();
                System.out.println("Time used = " + (end - start));
                return car;
            }
        });
        movable.move();
    }
}

interface Movable{
    void move();
}