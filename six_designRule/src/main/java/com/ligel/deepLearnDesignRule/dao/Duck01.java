package com.ligel.deepLearnDesignRule.dao;

public class Duck01 {
    //这里私有变量，子类是无法继承的
    public ChangeColor changeColor;
    public void swim() {
        System.out.println("所有鸭子都会游泳！");
    }
    //展示鸭子颜色
    public void performColor(){
        changeColor.color();
    }
    //改变颜色接口
    public void setClour(ChangeColor clour){
        changeColor=clour;
    }
}
