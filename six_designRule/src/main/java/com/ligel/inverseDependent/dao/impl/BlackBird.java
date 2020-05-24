package com.ligel.inverseDependent.dao.impl;

import com.ligel.inverseDependent.dao.Bird;

public class BlackBird implements Bird {
    public void fly() {
        System.out.println("我是黑鸟，我会低空飞翔!");
    }

    public void call() {
        System.out.println("我是黑鸟，我会嘎嘎叫！");
    }

    public void run() {
        System.out.println("我是黑鸟，我会快速跑！");
    }
}
