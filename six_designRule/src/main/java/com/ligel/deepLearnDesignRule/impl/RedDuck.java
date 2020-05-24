package com.ligel.deepLearnDesignRule.impl;

import com.ligel.deepLearnDesignRule.dao.Duck;

public class RedDuck implements Duck {
    public void swim() {
        System.out.println("是鸭子都会游泳！");
    }

    public void display() {
        RedColor redColor=new RedColor();
        redColor.color();
    }
}
