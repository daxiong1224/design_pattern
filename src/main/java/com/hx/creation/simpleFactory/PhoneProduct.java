package com.hx.creation.simpleFactory;

public class PhoneProduct implements Product {
    @Override
    public void createProduct() {
        System.out.println("生产手机！");
    }
}
