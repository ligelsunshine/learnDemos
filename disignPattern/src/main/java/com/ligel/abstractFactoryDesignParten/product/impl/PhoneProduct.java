package com.ligel.abstractFactoryDesignParten.product.impl;

import com.ligel.abstractFactoryDesignParten.product.MachineAbstractProduct;

//手机
public class PhoneProduct implements MachineAbstractProduct {
    public void show() {
        System.out.println("手机电子产品！");
    }
}
