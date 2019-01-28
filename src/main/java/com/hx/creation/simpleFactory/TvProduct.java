package com.hx.creation.simpleFactory;

public class TvProduct implements Product{
    @Override
    public void createProduct() {
        System.out.println("生产电视！");
    }
}
