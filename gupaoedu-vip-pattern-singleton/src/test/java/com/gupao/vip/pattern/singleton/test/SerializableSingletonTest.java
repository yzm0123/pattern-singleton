package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.serializable.SerializableSingleton;

import java.io.*;

public class SerializableSingletonTest {

    public static void main(String[] args) {

        SerializableSingleton lazy1 = SerializableSingleton.getInstance();//直接获取对象
        SerializableSingleton lazy2 = null;//后面通过反序列化获取对象

        try {
            //通过对象输出流将lazy1对象输出到磁盘文件SerializableSingleton.obj
            FileOutputStream fos = new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lazy1);
            oos.flush();
            oos.close();
            fos.close();

            //读取文件SerializableSingleton.obj，生成SerializableSingleton对象
            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lazy2 = (SerializableSingleton) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(lazy1);
            System.out.println(lazy2);
            //结果为false，说明单例被反序列化破坏了
            System.out.println(lazy1 == lazy2);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
