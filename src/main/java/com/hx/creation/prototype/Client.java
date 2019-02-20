package com.hx.creation.prototype;

//原型模式
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone == prototype);
        System.out.println(clone.toString());
    }

}
