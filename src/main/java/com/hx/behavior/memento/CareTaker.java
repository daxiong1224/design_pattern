package com.hx.behavior.memento;

//管理者：管理备忘录对象
public class CareTaker {
    //需要管理的备忘录对象，这里也可以使用list容器来存储可以备份多个点。
    private EmpMemento empMemento;

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
