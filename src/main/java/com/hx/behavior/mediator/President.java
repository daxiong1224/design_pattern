package com.hx.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

//中介者的具体实现：总经理
public class President implements Mediator{
    private Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        //根据部门名称向具体的部门下命令
        map.get(dname).selfAction();
    }


}
