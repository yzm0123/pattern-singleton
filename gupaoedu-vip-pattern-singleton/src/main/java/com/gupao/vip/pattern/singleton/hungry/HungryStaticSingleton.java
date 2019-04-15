package com.gupao.vip.pattern.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton ;

    private HungryStaticSingleton(){}

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }
    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }

}
