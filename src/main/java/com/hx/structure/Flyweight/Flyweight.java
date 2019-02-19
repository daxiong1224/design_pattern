package com.hx.structure.Flyweight;

//享元接口 定义了具体享元类公共的方法
public interface Flyweight {
    /**
     * 享元类的公共方法
     * @param extrinsicState 外部状态，每个享元对象的外部状态不同
     */
    void doOperation(String extrinsicState);
}
