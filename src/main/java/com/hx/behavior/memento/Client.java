package com.hx.behavior.memento;

public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();//构建一个备忘录管理者
        //构建发起人
        EmpOriginator emp = new EmpOriginator("张三", 20, 4000);
        System.out.println("第一次：" + emp.getEname() + "-----" + emp.getAge() + "-----" + emp.getSalary());
        //备份
        taker.setEmpMemento(emp.memento());

        //备份完了后修改
        emp.setEname("李四");
        emp.setAge(30);
        emp.setSalary(50000);
        //然后再次打印
        System.out.println("修改后：" + emp.getEname() + "----" + emp.getAge() + "---" + emp.getSalary());

        //开始恢复
        emp.recovery(taker.getEmpMemento());
        System.out.println("恢复后：" + emp.getEname() + "---" + emp.getAge() + "----" + emp.getSalary());

    }
}
