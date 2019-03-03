package com.hx.behavior.nullObj;

//空对象模式
public class Client {
    public static void main(String[] args) {
        AbstractOperation abstractOperation  = func(-1);
        abstractOperation.request();

    }

    public static AbstractOperation func(int para){
        //参数小于0 则返回空对象
        if(para < 0){
            return new NullOperation();
        }
        return new RealOperation();
    }
}
