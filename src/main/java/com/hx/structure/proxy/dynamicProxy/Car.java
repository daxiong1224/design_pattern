package com.hx.structure.proxy.dynamicProxy;

import java.util.Random;

//汽车对象，实现汽车移动的接口
public class Car implements Moveable{
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("正在开车....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
