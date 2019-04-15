package com.gupao.vip.pattern.singleton.register;

public enum EnumSingleton {
    ENUM_SINGLETON;

    private Object data;

    public Object getData() {
        return data;
    }

    public static EnumSingleton getInstance(){
        return ENUM_SINGLETON;
    }

}
