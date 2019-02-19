package com.hx.structure.Flyweight;

//具体享元类
public class ConcreteFlyweight implements Flyweight{
    //内部状态，享元对象共享内部状态
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address：" + System.identityHashCode(this));
        System.out.println("IntrinsicState：" + intrinsicState);
        System.out.println("ExtrinsicState：" + extrinsicState);
    }
}
