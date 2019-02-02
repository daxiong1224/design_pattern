package com.hx.behavior.templateMethod;

/**
 * 模板方法模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作咖啡开始！");
        MakeBeverage coffee = new Coffee();
        coffee.makeTemplate();
        System.out.println("咖啡制作好了！");

        System.out.println("=========================================");

        System.out.println("制作茶开始！");
        MakeBeverage tea = new Tea();
        tea.makeTemplate();
        System.out.println("茶制作好了");
    }
}
