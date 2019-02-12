package com.hx.behavior.command;

//定义Invoke,通过他来调用命令
public class Invoker {
    //调用者持有命令对象
    private Command onCommand;//开灯命令
    private Command offCommand;//关灯命令


    //执行操作
    public void onButtonWasPushed(){
        onCommand.execute();
    }

    //执行操作
    public void offButtonWasPushed(){
        offCommand.execute();
    }

    public Command getOnCommand() {
        return onCommand;
    }

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public Command getOffCommand() {
        return offCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }
}
