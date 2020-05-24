package com.ligel.factoryDesignPartent;

import com.ligel.factoryDesignPartent.dao.AbstractFactory;
import com.ligel.factoryDesignPartent.dao.AbstractProduct;
import com.ligel.factoryDesignPartent.impl.Product01Factory;
import com.ligel.factoryDesignPartent.impl.Product02Factory;

public class FactoryTest {
    public static void main(String[] args) {
        //创建第一个工厂
        AbstractFactory factory01= new Product01Factory();
        //创建第二个工厂
        AbstractFactory factory02= new Product02Factory();
        //创建产品01
        AbstractProduct product01= factory01.createProduct();
        //创建产品02
        AbstractProduct product02= factory02.createProduct();

        product01.show();
        product02.show();
    }
}
