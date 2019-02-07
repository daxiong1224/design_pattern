package com.hx.structure.proxy.dynamicProxy;



import java.lang.reflect.Proxy;

/**
 * 代理模式-动态代理
 */
public class Client {

    public static void main(String[] args) {
        //创建一个被代理的对象
        Car car = new Car();
        //创建一个与代理对象相关联的InvocationHandle
        TimeHandle h = new TimeHandle(car);
        Class<?> cls = car.getClass();

        /** 创建一个代理对象m来代理car，代理对象的每个执行方法都会替换invocation中的invoke方法
         * loader 类加载器
         * interfaces 实现接口
         * h InvocationHandle
         */
        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
        //代理执行移动方法
        m.move();
    }


}
