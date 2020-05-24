package com.ligel.deepLearnDesignRule;

import com.ligel.deepLearnDesignRule.dao.Duck;
import com.ligel.deepLearnDesignRule.dao.Duck01;
import com.ligel.deepLearnDesignRule.impl.*;

public class mainTest {
    public static void main(String[] args) {
        System.out.println("红色鸭子~~~~~~~~~~~");
        Duck duck= new RedDuck();
        duck.swim();
        duck.display();

        System.out.println("蓝色鸭子~~~~~~~~~~~");
        Duck duck1= new BlueDuck();
        duck1.swim();
        duck1.display();

        System.out.println("黑色鸭子~~~~~~~~~~~");
        Duck01 duck2= new BlackDuck();
        duck2.swim();
        duck2.performColor();
        //改变鸭子颜色
        duck2.setClour(new RedColor());
        duck2.performColor();

    }
}
