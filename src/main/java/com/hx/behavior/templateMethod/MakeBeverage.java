package com.hx.behavior.templateMethod;

/**
 * 制作饮料的抽象基类
 */
public abstract class MakeBeverage {
    //制作饮料的模板方法，声明为final，禁止子类修改模板方法
    public final void makeTemplate(){
        //步骤一 将水煮沸  （通用）
        boilWater();
        //步骤二 泡制饮料 （子类自定义实现）
        brew(); 
        //步骤三 将饮料倒入杯中（通用）
        pourInCup();
        //步骤四 加入调味料（子类自定义实现）
        addCondiment();
    }

    //泡制饮料
    protected abstract void brew();

    //加入调味料
    protected abstract void addCondiment();

    //将饮料倒入杯中，声明为private，对子类隐藏
    private void pourInCup() {
        System.out.println("将饮料倒入杯中！");
    }

    //将水煮沸，声明为private，对子类隐藏
    private void boilWater() {
        System.out.println("将水煮沸！");
    }


}
