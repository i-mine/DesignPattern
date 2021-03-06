package com.mobvista.dataplatform;

/**
 * author: dulei
 * date: 2018-06-27
 * desc:懒汉模式-线程不安全
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(singleton1 == null){//Mutli Thread could pass the check
            System.out.println("Init Singleton Firstly");
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public void showMessage(){
        System.out.println("Hello world!");
    }
}
