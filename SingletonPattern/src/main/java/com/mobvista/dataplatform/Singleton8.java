package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 8/26/20-9:25 AM
 * desc: 枚举单例，懒加载, 线程安全，防止序列化和反射侵入方式创建
 */
public enum Singleton8 {
    INSTANCE;
    public static Singleton8 getInstance(){
        return INSTANCE;
    }
}
