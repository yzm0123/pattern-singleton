package com.gupao.vip.pattern.singleton.register;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式单例
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static ConcurrentHashMap<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className){

        synchronized (ioc){
            if(!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return  obj;
            }
            return ioc.get(className);
        }
    }

}
