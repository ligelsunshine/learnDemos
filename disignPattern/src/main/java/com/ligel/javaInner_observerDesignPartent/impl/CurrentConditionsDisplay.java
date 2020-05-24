package com.ligel.javaInner_observerDesignPartent.impl;

import com.ligel.javaInner_observerDesignPartent.domain.WeaterDate;
import com.ligel.observerDesignPartent.dao.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperament;
    private float huminity;
    private float pressure;
    Observable weaterData;
    public CurrentConditionsDisplay(Observable weaterData){
        //在构造函数中进行注册（也就是将具体观察者与主题建立联系）
        this.weaterData= weaterData;
        //将当前对象注册到主题中
        weaterData.addObserver(this);
    }

    public void display() {
        System.out.println("目前 信息："+temperament+ huminity+ pressure);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeaterDate ){
            WeaterDate weaterDate= (WeaterDate)o;
            this.temperament= weaterDate.getTemperature();
            this.huminity= weaterDate.getHumidity();
            this.pressure= weaterDate.getPressure();
            display();
        }
    }
}
