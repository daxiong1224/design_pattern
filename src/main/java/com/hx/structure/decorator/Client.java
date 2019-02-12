package com.hx.structure.decorator;

/**
 * 装饰者模式
 */
public class Client {
    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();
        Mocha mocha = new Mocha(houseBlend);
        Milk milk = new Milk(mocha);
        System.out.println(milk.cost());
    }
}
