package com.hx.structure.bridge;

//第二种遥控器：遥控器的扩充具体类
public class Concrete2 extends RemoteControl{
    public Concrete2(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("Concrete 2 on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("Concrete 2 off");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("Concrete 2 tuneChannel");
        tv.tuneChannel();
    }
}
