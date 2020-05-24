package com.ligel.oneInterface;

import com.ligel.oneInterface.imp.Order;

public class oneInterfaceTest {
    public static void main(String[] args) {
        Goods goods= new Order();
        Logistics logistics=new Order();
        goods.getGoodName();
        goods.getStock();

        System.out.println("~~~~~~~~~~~~~~~");
        logistics.getLogisticsConpany();
    }
}
