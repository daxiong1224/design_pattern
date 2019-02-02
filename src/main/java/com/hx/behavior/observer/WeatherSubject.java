package com.hx.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，实现了注册（添加）和删除观察者的接口
 */
public class WeatherSubject implements Subject{
    //用来保存注册的观察者对象
    private List<Observer> observerList = new ArrayList<>();
    //天气内容
    private String weatherContent;

    //把订阅天气的人添加到订阅者列表中
    @Override
    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    //删除集合中的指定订阅天气的人
    @Override
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    //通知所有已经订阅了天气的人
    @Override
    public void notifyObserver(){
        for(Observer observer : observerList){
            observer.update(weatherContent);
        }
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    //发布天气情况
    public void setInfomation(String weatherContent){
        this.weatherContent = weatherContent;//设置天气内容
        notifyObserver();//通知
    }
}
