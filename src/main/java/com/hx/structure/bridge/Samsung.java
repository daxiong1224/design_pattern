package com.hx.structure.bridge;

//三星电视的具体实现类
public class Samsung implements TV{
    @Override
    public void on() {
        System.out.println("Samsung on");
    }

    @Override
    public void off() {
        System.out.println("Samsung off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Samsung tuneChannel");
    }
}
