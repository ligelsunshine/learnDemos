package com.ligel.javaInner_observerDesignPartent.domain;

import java.util.Observable;

public class WeaterDate extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    public WeaterDate(){}

    //更新管理
    public void measurementChange(){
        setChanged();
        notifyObservers();
    }
    //更新操作
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature= temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
