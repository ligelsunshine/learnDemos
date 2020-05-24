package com.ligel.abstractFactoryDesignParten.product.impl;

import com.ligel.abstractFactoryDesignParten.product.MachineAbstractProduct;

//电视
public class TVProduct implements MachineAbstractProduct {
    public void show() {
        System.out.println("电视电子产品！");
    }
}
