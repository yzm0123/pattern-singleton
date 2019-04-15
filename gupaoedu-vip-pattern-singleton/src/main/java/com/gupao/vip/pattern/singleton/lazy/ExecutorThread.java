package com.gupao.vip.pattern.singleton.lazy;

import com.gupao.vip.pattern.singleton.register.ContainerSingleton;
import com.gupao.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ExecutorThread implements Runnable {
    @Override
    public void run() {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        System.out.println("LazySimleSingleton:" + Thread.currentThread().getName() + ":" + lazySimpleSingleton);

//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println("LazyDoubleCheckSingleton:" + Thread.currentThread().getName() + ":" + lazyDoubleCheckSingleton);

//        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
//        System.out.println("lazyInnerClassSingleton:" + Thread.currentThread().getName() + ":" + lazyInnerClassSingleton);

//        Object obj = ContainerSingleton.getBean("com.gupao.vip.pattern.singleton.register.Pojo");
//        System.out.println("ContainerSingleton:" + Thread.currentThread().getName() + ":" + obj);

        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println("ThreadLocalSingleton:" + Thread.currentThread().getName() + ":" + threadLocalSingleton);
    }
}
