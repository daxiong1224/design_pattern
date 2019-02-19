package com.hx.structure.composite;

import java.util.ArrayList;
import java.util.List;

//容器构件类
public class Composite extends Component{
    //定义集合，用于存储Component类型的成员
    private List<Component> child;

    public Composite(String name) {
        super(name);
        child = new ArrayList<>();
    }

    @Override
    void print(int level) {
        for (int i = 0; i < level; i++){
            System.out.print("--");
        }
        System.out.println("Composite:" + name);
        for (Component component : child){
            component.print(level + 1);
        }
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void remove(Component component) {
        child.remove(component);
    }
}
