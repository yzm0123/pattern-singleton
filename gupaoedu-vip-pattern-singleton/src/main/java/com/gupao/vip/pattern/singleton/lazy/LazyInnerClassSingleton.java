package com.gupao.vip.pattern.singleton.lazy;

import java.io.Serializable;

/**
 * 利用静态内部类加载原理实现懒汉式单利:
 * 1、没有用到synchronized关键字，性能好！
 * 2、利用内部加载原理，先加载内部类，当用户调用时，先执行内部类中的逻辑
 *    实现单利。
 * 3、这是JVM底层的逻辑，完美的避免了线程安全问题
 * 4、性能最优的单利写法
 */
public class LazyInnerClassSingleton implements Serializable {

    private LazyInnerClassSingleton(){
        //为了防止调用者用反射破坏单例，在构造函数中增加判断。
        //其他单例也可以同抛异常的方式防止单例被反射破坏
        if (LazyHolder.lazyInnerClassSingleton != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    private static LazyInnerClassSingleton lazyingleton ;

    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazyInnerClassSingleton;
    }

    private static  class LazyHolder{

        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();

    }
}
