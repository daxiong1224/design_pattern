package com.hx.structure.adapter.classAdapter;

/**
 * 适配器模式-类适配器模式
 */
public class Client {
    public static void main(String[] args) {

        Duck duck = new TurkeyAdapter();
        duck.quack();
    }
}
