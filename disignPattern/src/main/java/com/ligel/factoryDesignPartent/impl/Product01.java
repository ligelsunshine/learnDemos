package com.ligel.factoryDesignPartent.impl;

import com.ligel.factoryDesignPartent.dao.AbstractProduct;

public class Product01 implements AbstractProduct {
    public void show() {
        System.out.println("生产产品01！");
    }
}
