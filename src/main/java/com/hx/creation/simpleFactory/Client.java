package com.hx.creation.simpleFactory;

/**
 * 简单工厂模式
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product1 = simpleFactory.createProduct("phone");
        product1.createProduct();
        Product product2 = simpleFactory.createProduct("tv");
        product2.createProduct();
    }
}
