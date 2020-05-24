package com.ligel.observerDesignPartent.dao;

public interface Observer {
    //更新信息
    public void update(float temp, float humidity, float pressure);
}
