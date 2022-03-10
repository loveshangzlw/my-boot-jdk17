package cn.penstaro.java.design;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: Penstaro
 * @date: 2022/3/9
 * @Description:
 **/
public class Singleton {
    private static Singleton sfj = new Singleton();
    private Singleton(){
        if (sfj != null) {
            throw new RuntimeException("error");
        }
    }
    public static Singleton getInstance(){
        return sfj;
    }
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton instance = getInstance();
        System.out.println(instance);
        Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            Object o = constructor.newInstance(null);
            System.out.println(0);
        }
    }
}
