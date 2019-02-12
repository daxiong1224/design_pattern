package com.hx.behavior.command;

//定义Receiver：命令接收者，也就是命令真正的执行者
public class Light {
    public void on(){
        System.out.println("Light is on");
    }

    public void off(){
        System.out.println("Light is off");
    }
}
