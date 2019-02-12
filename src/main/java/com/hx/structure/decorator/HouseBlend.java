package com.hx.structure.decorator;

//定义被装饰的类HouseBlend饮料
public class HouseBlend implements Beverage{
    @Override
    public double cost() {
        System.out.println("HouseBlend饮料，价格为一元。");
        return 1;
    }
}
