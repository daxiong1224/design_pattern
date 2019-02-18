package com.hx.structure.facade;

//提供看电视功能接口类
public class Facade {
    private SubSystem subSystem = new SubSystem();

    //封装了看电视所有的流程
    public void watchMovie(){
        subSystem.turnOnTV();
        subSystem.setCD();
        subSystem.startWatching();
    }
}
