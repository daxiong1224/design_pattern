package com.hx.behavior.strategy;

/**
 * 鸭子的第一种叫法
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("鸭子的第一种叫法：Quack");
    }
}
