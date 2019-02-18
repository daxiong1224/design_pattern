package com.hx.structure.facade;

//子系统类，提供了看电视各各流程的方法
public class SubSystem {

    public void turnOnTV(){
        System.out.println("打开电视！");
    }

    public void setCD(){
        System.out.println("打开cd");
    }

    public void startWatching(){
        System.out.println("开始看电视");
    }
}
