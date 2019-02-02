package com.hx.behavior.observer;

/**
 * 具体的观察者对象，实现更新的方法。
 */
public class ConcreteObserver implements Observer{
    private String observerName;//观察者的名称
    private String weatherContent;//天气内容情况
    private String remindThing;//提醒的内容


    @Override
    public void update(String content) {
        weatherContent = content;
        System.out.println(observerName + "收到了" + weatherContent + "," + remindThing);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
