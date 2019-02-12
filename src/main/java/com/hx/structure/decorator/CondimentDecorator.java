package com.hx.structure.decorator;

//定义装饰的抽象类
public abstract class CondimentDecorator implements Beverage{
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
