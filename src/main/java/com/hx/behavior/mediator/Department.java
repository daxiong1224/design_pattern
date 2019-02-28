package com.hx.behavior.mediator;

//抽象同事类：部门
public interface Department {
    //做本部门的事
    void selfAction();
    //向总经理发出申请
    void outAction();
}
