package com.hx.structure.adapter.classAdapter;

//实现火鸡叫声对象
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble method!");
    }
}
