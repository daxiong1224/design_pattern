package com.hx.behavior.memento;

//备忘录对象
public class EmpMemento {
    //自身属性
    private String ename;
    private int age;
    private double salary;

    //构造备忘录对象时，需要转入一个需要备忘的对象（发起人）
    public EmpMemento(EmpOriginator emp) {
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
