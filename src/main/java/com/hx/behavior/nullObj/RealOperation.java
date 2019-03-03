package com.hx.behavior.nullObj;

//非空对象的具体实现
public class RealOperation implements AbstractOperation{
    @Override
    public void request() {
        System.out.println("do smomething");
    }
}
