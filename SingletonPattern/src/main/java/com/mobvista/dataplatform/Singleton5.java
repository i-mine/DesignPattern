package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 8/26/20-9:07 AM
 * desc: 饿汉模式-若该实例一直未被使用，则会造成资源浪费
 */
public class Singleton5 {
    private static Singleton5 INSTANCE = new Singleton5();
    private  Singleton5(){}

    public static Singleton5 getInstance(){
        return INSTANCE;
    }
}
