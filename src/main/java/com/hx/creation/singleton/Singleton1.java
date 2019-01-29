package com.hx.creation.singleton;

/**
 * 单例模式-恶汉式
 *
 */
public class Singleton1 {
    //私有化构造方法，使外部无法直接创建对象
    private Singleton1(){
    }

    //创建类的唯一实例
    private static Singleton1 instance = new Singleton1();

    //提供获取实例的方法
    public static Singleton1 getSingleton1(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getSingleton1();
        Singleton1 singleton2 = Singleton1.getSingleton1();

        if(singleton1 == singleton2){
            System.out.println("对象相同");
        }else {
            System.out.println("对象不同");
        }
    }
}
