package com.hx.behavior.observer;

/**
 * 定义抽象目标接口
 * 声明了添加、删除、通知观察者的方法
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
