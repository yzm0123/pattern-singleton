package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.ExecutorThread;

public class LazySimpleSingletonTest {

    public static void main(String[] args) {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End;");
    }
}
