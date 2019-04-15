package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.register.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    /**
     * 这里测试序列化是否会破坏枚举式单例，
     * 测试结果表明，枚举式单例不会被序列化、反序列化破坏
     * @param args
     */
    public static void main(String[] args) {
        EnumSingleton lazy1 = EnumSingleton.getInstance();
        EnumSingleton lazy2 = null;

        try {
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lazy1);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lazy2 = (EnumSingleton)ois.readObject();
            ois.close();
            fis.close();

            System.out.println(lazy1);
            System.out.println(lazy2);
            System.out.println(lazy1 == lazy2);
            System.out.println(lazy1 .getData()== lazy2.getData());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 这里测试反射是否会破坏枚举式单例
     * Cannot reflectively create enum objects
     * @param args
     */
//    public static void main(String[] args) {
//        Class c = EnumSingleton.class;
//        try {
//            Constructor constructor = c.getDeclaredConstructor(String.class,int.class);
//            constructor.setAccessible(true);
//            EnumSingleton enumSingleton1 = (EnumSingleton)constructor.newInstance("tom",123);
//            EnumSingleton enumSingleton2 = (EnumSingleton)constructor.newInstance("gupao",123456);
//            EnumSingleton enumSingleton3 = EnumSingleton.getInstance();
//
//            System.out.println(enumSingleton1);
//            System.out.println(enumSingleton2);
//            System.out.println(enumSingleton3);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

}
