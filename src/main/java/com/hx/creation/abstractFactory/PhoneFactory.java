package com.hx.creation.abstractFactory;

/**
 * 具体的工厂子类-手机
 */
public class PhoneFactory implements ProductFactory{
    @Override
    public Product getProduct() {
        return new PhoneProduct();
    }
}
