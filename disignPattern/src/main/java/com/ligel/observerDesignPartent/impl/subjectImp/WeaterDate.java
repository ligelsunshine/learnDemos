package com.ligel.observerDesignPartent.impl.subjectImp;

import com.ligel.observerDesignPartent.dao.Observer;
import com.ligel.observerDesignPartent.dao.Subject;

import java.util.ArrayList;
import java.util.Iterator;

public class WeaterDate implements Subject {
    //存储观察者
    private ArrayList observers;
    //温度
    private float temperature;
    //湿度
    private float humidity;
    //压力
    private float pressure;

    public WeaterDate(){
        //在构造函数观察者中初始化
        observers= new ArrayList();
    }
    public void registerOberver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>0){
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        // 将跟更新的数据推送给没一个订阅者（观察者）
        for(Iterator it= observers.iterator(); it.hasNext();){
            Observer observer= (Observer)it.next();
            observer.update(temperature, humidity, pressure);
        }
    }

    //当从气象站得到更新数据时，就通知观察者
    public void measurementsChange(){
        notifyObserver();
    }

    //更新数据并通知所有观察者
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }
}
