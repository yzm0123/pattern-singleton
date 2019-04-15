package com.gupao.vip.pattern.singleton.lazy;

/**
 * 双重检查锁懒汉式单例
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton ;

    private LazyDoubleCheckSingleton(){}

    /**
     * 双重判空+synchronized 性能比直接在方法上加synchronized更优
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
