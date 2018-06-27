package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 2018-06-27
 * desc: 单例模式使用模拟环境
 */
public class SingletonParttenClient {
    public static void main(String[] args) {
        //获取唯一的单例对象
        Singleton1 singleton1 = Singleton1.getInstance();
        //调用单例方法
        singleton1.showMessage();
        //再次获取单例
        Singleton1 singleton11 = Singleton1.getInstance();
        System.out.println("比较两次获取的单例对象是否唯一:"+(singleton1==singleton11));

    }
}
