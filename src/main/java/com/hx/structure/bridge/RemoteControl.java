package com.hx.structure.bridge;

//遥控器的抽象类
public abstract class RemoteControl {
    protected TV tv;//引入实现类的接口

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
