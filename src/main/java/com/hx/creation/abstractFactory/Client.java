package com.hx.creation.abstractFactory;

/**
 * 抽象工厂模式
 */
public class Client {
    //不同的工厂产生不同的产品对象
    public static void main(String[] args) {
        ProductFactory productFactory = null;
        //phone
        productFactory = new PhoneFactory();
        Product product = productFactory.getProduct();
        product.createProduct();

        //tv
        productFactory = new TvFactory();
        Product product1 = productFactory.getProduct();
        product1.createProduct();
    }
}
