package com.hx.creation.abstractFactory;

/**
 * 具体产品角色，电视产品类
 */
public class TvProduct implements Product{
    @Override
    public void createProduct() {
        System.out.println("生产电视！");
    }
}
