package com.hx.structure.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 时间处理器
 */
public class TimeHandle implements InvocationHandler{
    private Object target;

    public TimeHandle(Object target) {
        super();
        this.target = target;
    }


    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return Object 方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶..");
        method.invoke(target);//执行被代理对象的方法
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束... 总行驶时间：" + (endTime - startTime));

        return null;
    }
}
