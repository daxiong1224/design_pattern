package com.hx.behavior.templateMethod;

/**
 * 制作茶的具体类
 */
public class Tea extends MakeBeverage{
    @Override
    protected void brew() {
        System.out.println("用热水浸泡茶叶5分钟！");
    }

    @Override
    protected void addCondiment() {
        System.out.println("加入柠檬！");
    }
}
