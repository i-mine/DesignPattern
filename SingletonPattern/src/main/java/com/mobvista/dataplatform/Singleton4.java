package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 8/25/20-9:18 AM
 * desc: TODO
 */
public class Singleton4 {
    private static volatile Singleton4 INSTANCE;
    private Singleton4(){};

    public static Singleton4 getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton4.class){
                //第一个锁用于延迟加载，为了防御通过第一道防御的多线程唤醒之后会立马创建对象，这里再判断一次，防止重复创建
                if(INSTANCE == null){
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
