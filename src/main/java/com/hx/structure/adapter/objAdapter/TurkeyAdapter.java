package com.hx.structure.adapter.objAdapter;

/**
 * 将鸭子叫声转换成火鸡叫声的适配器--对象适配器模式
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
