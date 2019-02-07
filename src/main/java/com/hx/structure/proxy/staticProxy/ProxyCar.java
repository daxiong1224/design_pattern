package com.hx.structure.proxy.staticProxy;

//汽车的静态代理对象，使用聚合模式
public class ProxyCar implements Moveable{
    private Car car;//代理对象作为成员属性的聚合模式

    public ProxyCar(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶..");
        car.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束... 总行驶时间：" + (endTime - startTime));
    }
}
