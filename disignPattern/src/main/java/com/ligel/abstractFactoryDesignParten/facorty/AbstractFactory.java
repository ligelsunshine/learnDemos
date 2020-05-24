package com.ligel.abstractFactoryDesignParten.facorty;

import com.ligel.abstractFactoryDesignParten.product.FruitAbstractProduct;
import com.ligel.abstractFactoryDesignParten.product.MachineAbstractProduct;

public interface AbstractFactory {
    //生产电子产品
    public MachineAbstractProduct createMachine();
    //生产水果
    public FruitAbstractProduct createFruit();

}
