package com.hx.behavior.strategy;

/**
 * 鸭子对象
 */
public class Duck {
    private QuackBehavior quackBehavior;

    public void performQuack(){
        if(quackBehavior != null){
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
