package com.hx.creation.simpleFactory;

/**
 * 简单工厂，被所有需要实例化的客户类调用
 */
public class SimpleFactory {
    public Product createProduct(String type){
        if(type == "phone"){
            return new PhoneProduct();
        }else if(type == "tv"){
            return new TvProduct();
        }
        return null;
    }

}
