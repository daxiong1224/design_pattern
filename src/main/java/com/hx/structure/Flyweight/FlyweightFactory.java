package com.hx.structure.Flyweight;

import java.util.HashMap;

//享元工厂
public class FlyweightFactory {
    //定义享元池
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    //提供一个存储在享元池中已创建的实例或者创建一个新的实例（如果不存在的话），
    //返回新创建的实例并将其存储在享元池中。
    Flyweight getFlyweight(String intrinsicState){
        if(!flyweights.containsKey(intrinsicState)){
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }

    /**
     * 注：在实际项目中，享元工厂类可以结合单例模式来设计
     */
}
