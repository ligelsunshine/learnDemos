package com.ligel.openAndclose.mpl;

import com.ligel.openAndclose.Bird;

public class EnhanceBird implements Bird {
    //构造函数
    public EnhanceBird(){
        super();
    }
    public void fly() {
        System.out.println("我会飞！");
    }

    public void call() {
        System.out.println("叽叽的叫！");
    }

    public void swim(){
        System.out.println("我还会游泳！");
    }
}
