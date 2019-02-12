package com.hx.structure.decorator;

//定义具体的装饰者牛奶
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double price = 1 + super.cost();
        System.out.println("添加了牛奶配料，价格加一块。");
        return price;
    }
}
