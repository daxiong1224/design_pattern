package com.hx.behavior.observer;

/**
 * 观察者模式
 */
public class Client {
    public static void main(String[] args) {
       //创建目标
       WeatherSubject weatherSubject = new WeatherSubject();

       //创建观察者
       ConcreteObserver observer1 = new ConcreteObserver();
       observer1.setObserverName("1号观察者");
       observer1.setRemindThing("1号观察者的提醒内容");

       ConcreteObserver observer2 = new ConcreteObserver();
       observer2.setObserverName("2号观察者");
       observer2.setRemindThing("2号观察者的提醒内容");

       //注册观察者
        weatherSubject.registerObserver(observer1);
        weatherSubject.registerObserver(observer2);

       //目标发布天气，观察者收到提醒
        weatherSubject.setInfomation("下雨");

        System.out.println("=========================================");

        //1号观察者取消观察
        weatherSubject.removeObserver(observer1);

        //再次发布天气
        weatherSubject.setInfomation("晴天");
    }
}
