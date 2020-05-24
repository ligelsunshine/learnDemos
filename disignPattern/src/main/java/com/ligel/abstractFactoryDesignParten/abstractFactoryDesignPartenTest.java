package com.ligel.abstractFactoryDesignParten;

import com.ligel.abstractFactoryDesignParten.facorty.AbstractFactory;
import com.ligel.abstractFactoryDesignParten.facorty.impl.Factory01;
import com.ligel.abstractFactoryDesignParten.facorty.impl.Factory02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class abstractFactoryDesignPartenTest {
    public static void main(String[] args) {
        //工厂01
        AbstractFactory factory01= new Factory01();
        //工厂02
        AbstractFactory factory02= new Factory02();
        System.out.println("~~~~~~~工厂01~~~~~~");
        factory01.createFruit();
        factory01.createMachine();
        System.out.println("~~~~~~~工厂02~~~~~~");
        factory02.createFruit();
        factory02.createMachine();


        ArrayList list = new ArrayList();
        List list1 = new LinkedList();
        Queue queue = new LinkedList();
    }
}
