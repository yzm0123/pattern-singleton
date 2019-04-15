package com.gupao.vip.pattern.singleton.threadlocal;

public class ThreadLocalSingleton {

    /**
     * 饿汉式创建线程单例对像 伪线程安全
     */
    private static ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    /**
     * 获取当前线程对应的单例对像
     * @return
     */
    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
