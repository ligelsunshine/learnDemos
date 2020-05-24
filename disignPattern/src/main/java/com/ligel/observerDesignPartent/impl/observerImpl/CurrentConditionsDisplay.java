package com.ligel.observerDesignPartent.impl.observerImpl;

import com.ligel.observerDesignPartent.dao.DisplayElement;
import com.ligel.observerDesignPartent.dao.Observer;
import com.ligel.observerDesignPartent.dao.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float huminity;
    private float pressure;
    private Subject weaterData;

    public CurrentConditionsDisplay(Subject weaterData){
        //在构造函数中进行注册（也就是将具体观察者与主题建立联系）
        this.weaterData= weaterData;
        //将当前对象注册到主题中
        weaterData.registerOberver(this);
    }
    public void display() {
        System.out.println("目前 信息："+temperature+ huminity+ pressure);
    }
    //更细信息
    public void update(float temperature, float humidity, float pressure) {
        this.temperature= temperature;
        this.huminity= humidity;
        this.pressure= pressure;
        display();
    }

}
