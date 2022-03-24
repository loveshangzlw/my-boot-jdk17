package cn.penstaro.java.design.proxy.exer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Penstaro
 * @date: 2022/3/14
 * @Description:
 **/
public class DyOfProxyAnimal implements Eatable{

    @Override
    public void eat() {
        System.out.println("eat three times very day...");
    }

    @Override
    public void sleep() {
        System.out.println("sleep one time~~~");
    }

    public static void main(String[] args) {
        Eatable e = (Eatable)Proxy.newProxyInstance(DyOfProxyAnimal.class.getClassLoader(), new Class[]{Eatable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                DyOfProxyAnimal d = new DyOfProxyAnimal();
                System.out.println("before eat...");
                d.eat();
                System.out.println("after eat...");
                System.out.println("before sleep...");
                d.sleep();
                System.out.println("after sleep...");
                return d;
            }
        });
        e.eat();
        e.sleep();
    }
}

interface Eatable{
    void eat();
    void sleep();
}
