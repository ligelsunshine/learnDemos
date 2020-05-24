package com.ligel.abstractFactoryDesignParten.product.impl;

import com.ligel.abstractFactoryDesignParten.product.FruitAbstractProduct;

//香蕉
public class BananaProduct implements FruitAbstractProduct {
    public void show() {
        System.out.println("香蕉产品！");
    }
}
