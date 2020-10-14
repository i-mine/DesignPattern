package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 8/25/20-9:14 AM
 * desc: 懒汉模式-同步代码块-线程不安全
 */
public class Singleton3 {
    private static  Singleton3 INSTANCE;

    private Singleton3(){};

    public static Singleton3 getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton3.class){
                INSTANCE = new Singleton3();
            }
        }
        return INSTANCE;
    }
}
