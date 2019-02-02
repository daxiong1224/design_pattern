package com.hx.behavior.strategy;

/**
 * 鸭子的第二种叫法
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("鸭子的第二种叫法：Squeak");
    }
}
