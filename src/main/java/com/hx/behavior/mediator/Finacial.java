package com.hx.behavior.mediator;

//具体同事类：财务部
public class Finacial implements Department{
    private Mediator m;//中介者，总经理

    public Finacial(Mediator m) {
        super();
        this.m = m;
        //向中介者注册自己
        m.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("财务部：会计正在核对财务..");
    }

    @Override
    public void outAction() {
        System.out.println("财务部向总经理说：钱很多，花不完..");
    }
}
