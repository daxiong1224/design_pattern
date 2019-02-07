package com.hx.structure.proxy.staticProxy;

/**
 * 代理模式-静态代理-聚合方式实现
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        ProxyCar proxyCar = new ProxyCar(car);
        proxyCar.move();
    }
}
