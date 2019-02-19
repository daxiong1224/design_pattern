package com.hx.structure.composite;

//叶子构件类
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    void print(int level) {
        for (int i = 0;  i < level; i++){
            System.out.print("--");
        }
        System.out.println("left：" + name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();//牺牲透明性换取单一职责原则
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
