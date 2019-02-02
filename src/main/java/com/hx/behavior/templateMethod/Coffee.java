package com.hx.behavior.templateMethod;

/**
 * 制作咖啡的具体实现
 */
public class Coffee extends MakeBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡！");
    }

    @Override
    protected void addCondiment() {
        System.out.println("加入糖和牛奶！");
    }
}
