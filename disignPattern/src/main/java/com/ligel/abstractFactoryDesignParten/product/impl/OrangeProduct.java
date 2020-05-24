package com.ligel.abstractFactoryDesignParten.product.impl;

import com.ligel.abstractFactoryDesignParten.product.FruitAbstractProduct;

//橘子
public class OrangeProduct implements FruitAbstractProduct {
    public void show() {
        System.out.println("橘子产品！");
    }
}
