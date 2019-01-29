package com.hx.creation.singleton;

/**
 * 单例模式-懒汉式
 */
public class Singleton2 {
    //私有化构造方法，无法通过外部直接创建对象
    private Singleton2(){

    }

    //声明类的唯一实例
    //使用volatile修饰防止指令重排序的忧化，保证多线程情况下安全
    private volatile static Singleton2 instance;


    //线程不安全
//    public static  Singleton2 getInstance(){
//        if(instance == null){
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    //线程安全且能正确执行，但会有阻塞性能问题，每次都需要排队，但实际创建对象的情况非常少
//    public static synchronized  Singleton2 getInstance(){
//        synchronized (Singleton2.class) {
//            if (instance == null) {
//                instance = new Singleton2();
//            }
//        }
//        return instance;
//    }

    //线程安全(推荐) ----双重校验锁
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton3 = Singleton2.getInstance();
        if(singleton2 == singleton3){
            System.out.println("对象相同");
        }else {
            System.out.println("对象不同");
        }
    }

}
