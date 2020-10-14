package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 8/26/20-9:22 AM
 * desc: 静态内部类-懒加载，线程安全
 */
public class Singleton7 {
    private Singleton7(){}

    public static Singleton7 getInstance(){
        return InnerClass.INSTANCE;
    }
    private static class InnerClass{
        private static final Singleton7 INSTANCE = new Singleton7();
    }
}
