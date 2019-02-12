package com.hx.structure.decorator;

//定义具体的装饰者Mocha
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double price = 1 + super.cost();
        System.out.println("加入了Mocha配料，价格加一块。");
        return price;
    }
}
