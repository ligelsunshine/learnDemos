package com.ligel.inverseDependent.dao.impl;

import com.ligel.inverseDependent.dao.Bird;

public class RedBird implements Bird {

    public void fly() {
        System.out.println("我是红鸟，我高空飞翔！！");
    }

    public void call() {
        System.out.println("我是红鸟，我会叽叽叫！");
    }

    public void run() {
        System.out.println("我是红鸟，我会慢跑！");
    }
}
