package com.hx.structure.bridge;

//第一种遥控器：遥控器的扩充具体类
public class Concrete1 extends RemoteControl{
    public Concrete1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("Concrete 1 on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("Concrete 1 off");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("Concrete 1 tuneChannel");
        tv.tuneChannel();
    }
}
