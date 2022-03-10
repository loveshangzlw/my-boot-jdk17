package cn.penstaro.java.design.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: Penstaro
 * @date: 2022/3/9
 * @Description:
 **/
public class SimpleSingleton {
    private static SimpleSingleton st = new SimpleSingleton();
    private SimpleSingleton(){
        if (st != null) {
            throw new RuntimeException("error");
        }
    }
    public static SimpleSingleton getInstance(){
        return st;
    }
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        SimpleSingleton instance = getInstance();
        System.out.println(instance);
        Constructor<?>[] constructors = SimpleSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            Object o = constructor.newInstance(null);
            System.out.println(0);
        }
    }
}
