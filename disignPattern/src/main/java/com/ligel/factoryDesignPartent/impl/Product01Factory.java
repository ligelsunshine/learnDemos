package com.ligel.factoryDesignPartent.impl;

import com.ligel.factoryDesignPartent.dao.AbstractFactory;
import com.ligel.factoryDesignPartent.dao.AbstractProduct;

public class Product01Factory implements AbstractFactory {
    public AbstractProduct createProduct() {
        return new Product01();
    }
}
