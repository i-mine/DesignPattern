package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 8/26/20-9:17 AM
 * desc: 饿汉-静态代码块
 */
public class Singleton6 {
    private static Singleton6 INSTANCE;
    static {
        INSTANCE = new Singleton6();
    }

    private Singleton6(){}

    public static Singleton6 getInstance(){
        return INSTANCE;
    }
}
