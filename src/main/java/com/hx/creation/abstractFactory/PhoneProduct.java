package com.hx.creation.abstractFactory;


/**
 * 具体产品角色，手机产品类
 */
public class PhoneProduct implements Product {
    @Override
    public void createProduct() {
        System.out.println("生产手机！");
    }
}
