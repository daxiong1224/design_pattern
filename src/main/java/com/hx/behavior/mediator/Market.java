package com.hx.behavior.mediator;

//具体同事类：市场不
public class Market implements Department {
    private Mediator m;

    public Market(Mediator m) {
        super();
        this.m = m;
        //向中介者注册自己
        m.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("市场部:正在跑市场...");
    }

    @Override
    public void outAction() {
        System.out.println("市场部向总经理说：合同已搞定，需财务部报销..");
        //通过总经理这个中介，向总经理发出申请，告知需要跟财务部交互报销经费
        m.command("finacial");
    }
}
