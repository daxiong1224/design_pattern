package com.hx.structure.adapter.classAdapter;


/**
 * 将鸭子叫声转换成火鸡叫声的适配器 --类适配器模式
 */
public class TurkeyAdapter extends WildTurkey implements Duck {
    @Override
    public void quack() {
        gobble();
    }
}
