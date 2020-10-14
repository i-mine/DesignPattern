package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 18-7-4
 * desc: 懒汉模式-线程安全
 *
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2(){};
    //每次调用getInstance申请锁，开销较大
    public static synchronized Singleton2 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
