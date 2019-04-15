package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.ExecutorThread;
import com.gupao.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        //主线程获取到的单例对像都相同
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        Thread t3 = new Thread(new ExecutorThread());
        Thread t4 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Executor End;");

    }

}
