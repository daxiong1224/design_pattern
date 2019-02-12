package com.hx.behavior.command;

//定义ConcreteCommand,将一个接受者对象绑定与一个动作
public class LightOffCommand implements Command{
    //持有一个接受者的引用，绑定一个off的操作
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
