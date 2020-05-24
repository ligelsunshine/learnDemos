package com.ligel.inverseDependent.dao;

import com.ligel.inverseDependent.dao.impl.BlackBird;
import com.ligel.inverseDependent.dao.impl.RedBird;

public class InverseDependentTest {
    public static void main(String[] args) {
        Bird bird= new RedBird();
        Bird bird1=  new BlackBird();
        System.out.println("红鸟 ~~~~~~~~~~~~~~~~~~~~~~~");
        bird.call();
        bird.fly();
        bird.run();
        System.out.println("黑鸟 ~~~~~~~~~~~~~~~~~~~~~~~");
        bird1.call();
        bird1.fly();
        bird1.run();
    }
}
