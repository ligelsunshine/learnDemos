package com.ligel.factoryDesignPartent.dao;

public interface AbstractFactory {
    //我明白为何要抽象商品了，这里返回的时抽象商品，只对商品接口进行操作。
    public AbstractProduct createProduct();
}
