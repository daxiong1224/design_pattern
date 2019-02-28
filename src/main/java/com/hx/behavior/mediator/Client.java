package com.hx.behavior.mediator;

//中介者模式
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();
        Market market = new Market(m);
        market.selfAction();
        market.outAction();
    }
}
