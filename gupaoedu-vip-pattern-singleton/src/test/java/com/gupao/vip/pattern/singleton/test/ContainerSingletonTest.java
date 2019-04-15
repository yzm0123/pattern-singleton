package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.ExecutorThread;
import com.gupao.vip.pattern.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {

    public static void main(String[] args) {
//        Object obj  = ContainerSingleton.getBean("com.gupao.vip.pattern.singleton.register.Pojo");
//        System.out.println(obj);

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();
        System.out.println("Executor End;");
    }
}
