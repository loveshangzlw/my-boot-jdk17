package cn.penstaro.java.Proxy;

import java.util.Random;

/**
 * @author: Penstaro
 * @date: 2022/3/11
 * @Description:
 **/
public class Tank implements Movable{
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("move zzzzzzzz~~~~~~~~~");
    }

    public static void main(String[] args) {
        new TankLogProxy(
                new TankTimeProxy(
                        new Tank()
                )).move();
    }
}

class TankTimeProxy implements Movable{
    Movable m;
    public TankTimeProxy(Movable m) {
        this.m = m;
    }
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("TankTimeProxy time is = " + (end - start));
    }
}


class TankLogProxy implements Movable{
    Movable m;
    public TankLogProxy(Movable m) {
        this.m = m;
    }
    @Override
    public void move() {
        System.out.println("log start");
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("log end");
    }
}

interface Movable{
    void move();
}
