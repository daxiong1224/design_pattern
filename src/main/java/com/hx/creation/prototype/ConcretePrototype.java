package com.hx.creation.prototype;

//具体原型类
public class ConcretePrototype implements Prototype{
    private String filed;//成员属性

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    public Prototype myClone() {
        //痛用的写法，将原成员变量传入到新的对象中
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
