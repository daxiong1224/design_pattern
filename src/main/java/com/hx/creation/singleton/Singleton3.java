package com.hx.creation.singleton;

/**
 * 静态内部类的实现
 * 好处：延迟加载，由JVM提供对线程安全的支持
 */
public class Singleton3 {
    private Singleton3 (){

    }

    private static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstanc(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton3 singleton3 = Singleton3.getInstanc();
        System.out.println(singleton3);
    }
}
