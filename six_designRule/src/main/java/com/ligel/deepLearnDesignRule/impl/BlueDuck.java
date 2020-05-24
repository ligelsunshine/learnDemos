package com.ligel.deepLearnDesignRule.impl;

import com.ligel.deepLearnDesignRule.dao.ChangeColor;
import com.ligel.deepLearnDesignRule.dao.Duck;

public class BlueDuck implements Duck {
    public void swim() {
        System.out.println("所有鸭子都会游泳！");
    }

    public void display() {
        ChangeColor changeColor= new BlueColou();
        changeColor.color();
    }
}
