package com.hx.behavior.state;

//上下文对象：用来引用一个state的示例，维护各个状态
public class Context {
    private State state;//当前状态
    public void request(State s){
        System.out.println("修改状态：");
        this.state = s;
        state.handle();
    }
}
