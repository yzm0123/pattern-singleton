package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.ExecutorThread;

public class LazyDoubleCheckSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();
        System.out.println("Executor End;");
    }
}
