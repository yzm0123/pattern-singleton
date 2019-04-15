package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new ExecutorThread());
//        Thread t2 = new Thread(new ExecutorThread());
//
//        t1.start();
//        t2.start();
//
//        System.out.println("Executor End;");


        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            //调用者不走寻常路，通过反射破坏了单例
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazyInnerClassSingleton lazy1 = (LazyInnerClassSingleton)constructor.newInstance();
            LazyInnerClassSingleton lazy2 = (LazyInnerClassSingleton)constructor.newInstance();
            LazyInnerClassSingleton lazy3 = LazyInnerClassSingleton.getInstance();

            System.out.println("lazy1" + lazy1);
            System.out.println("lazy2" + lazy2);
            System.out.println("lazy3" + lazy3);
            System.out.println(lazy1 == lazy2);
            System.out.println(lazy1 == lazy3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
