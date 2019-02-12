package com.hx.behavior.command;

/**
 * 命令模式
 */
public class Client {
    public static void main(String[] args) {
        //创建命令的接受者，灯
        Light light = new Light();
        //创建命令执行者，并将相应的命令作为参数传递给Invoker
        Invoker invoker = new Invoker();
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);
        invoker.setOnCommand(onCommand);
        invoker.setOffCommand(offCommand);
        //执行命令
        invoker.onButtonWasPushed();
        invoker.offButtonWasPushed();
    }
}
