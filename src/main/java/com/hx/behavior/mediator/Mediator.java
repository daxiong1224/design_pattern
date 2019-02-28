package com.hx.behavior.mediator;

//抽象中介者
public interface Mediator {
    //将具体的同事类注册到中介者上，让中介者知道所有的同事
    void register(String dname, Department d);
    //通过部门名称，发出命令
    void command(String name);
}
