package com.hx.structure.bridge;

//索尼电视的具体实现类
public class Sony implements TV{
    @Override
    public void on() {
        System.out.println("Sony on");
    }

    @Override
    public void off() {
        System.out.println("Sony off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony tuneChannel");
    }
}
