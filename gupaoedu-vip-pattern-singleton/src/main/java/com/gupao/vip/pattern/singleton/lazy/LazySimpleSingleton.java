package com.gupao.vip.pattern.singleton.lazy;

/**
 * 简单的懒汉式单例
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton(){}

    /**
     * 在jdk1.6之后，synchronize性能优化了不上，
     * 在方法上加上synchronized，有可能会对整个类进行锁定，
     * 性能还是存在问题
     * @return
     */
    public synchronized static LazySimpleSingleton getInstance(){

        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}
