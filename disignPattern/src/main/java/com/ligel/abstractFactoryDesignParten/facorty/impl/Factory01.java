package com.ligel.abstractFactoryDesignParten.facorty.impl;

import com.ligel.abstractFactoryDesignParten.facorty.AbstractFactory;
import com.ligel.abstractFactoryDesignParten.product.FruitAbstractProduct;
import com.ligel.abstractFactoryDesignParten.product.MachineAbstractProduct;
import com.ligel.abstractFactoryDesignParten.product.impl.BananaProduct;
import com.ligel.abstractFactoryDesignParten.product.impl.TVProduct;
//工厂01生产电视和香蕉
public class Factory01 implements AbstractFactory {
    public MachineAbstractProduct createMachine() {
        System.out.println("生产电视");
        return new TVProduct();
    }

    public FruitAbstractProduct createFruit() {
        System.out.println("生产香蕉");
        return new BananaProduct();
    }
}
