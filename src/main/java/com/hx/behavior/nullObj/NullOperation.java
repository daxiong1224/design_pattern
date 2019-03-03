package com.hx.behavior.nullObj;

//空对象类的实现
public class NullOperation implements AbstractOperation{
    @Override
    public void request() {
        //do nothing
        System.out.println("obj is null");
    }
}
