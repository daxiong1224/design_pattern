package com.hx.structure.bridge;

//桥接模式
public class Client {
    public static void main(String[] args) {
        //创建可以遥控索尼电视的遥控器对象
        Concrete1 concrete1 = new Concrete1(new Sony());
        concrete1.on();
        concrete1.off();
        concrete1.tuneChannel();

        System.out.println("=========================");

        //创建可以遥控三星电视的遥控器对象
        Concrete2 concrete2 = new Concrete2(new Samsung());
        concrete2.on();
        concrete2.off();
        concrete2.tuneChannel();
    }
}
