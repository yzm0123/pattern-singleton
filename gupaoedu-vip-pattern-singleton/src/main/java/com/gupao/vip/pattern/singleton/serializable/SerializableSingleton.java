package com.gupao.vip.pattern.singleton.serializable;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton SERIALIZABLE_SINGLETON = new SerializableSingleton();

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance(){
        return SERIALIZABLE_SINGLETON;
    }

    /**
     * 通过该方法解决单例被反序列化破坏的问题
     * 在jvm底层还是创建了一个反序列化的对象，只是改对象又被
     * 这个方法返回的对象覆盖了，反序列化创建的对象，最终由于没有
     * 引用，会不GC。
     * @return
     */
    private Object readResolve(){
        return SERIALIZABLE_SINGLETON;
    }
}
