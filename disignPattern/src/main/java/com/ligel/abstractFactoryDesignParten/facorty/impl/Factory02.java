package com.ligel.abstractFactoryDesignParten.facorty.impl;


import com.ligel.abstractFactoryDesignParten.facorty.AbstractFactory;
import com.ligel.abstractFactoryDesignParten.product.FruitAbstractProduct;
import com.ligel.abstractFactoryDesignParten.product.MachineAbstractProduct;
import com.ligel.abstractFactoryDesignParten.product.impl.OrangeProduct;
import com.ligel.abstractFactoryDesignParten.product.impl.PhoneProduct;

//工厂02生产橘子和手机
public class Factory02 implements AbstractFactory {

    public MachineAbstractProduct createMachine() {
        System.out.println("生产手机");
        return new PhoneProduct();
    }

    public FruitAbstractProduct createFruit() {
        System.out.println("生产橘子");
        return new OrangeProduct();
    }
}
