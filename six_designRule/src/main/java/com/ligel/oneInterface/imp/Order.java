package com.ligel.oneInterface.imp;

import com.ligel.oneInterface.Goods;
import com.ligel.oneInterface.Logistics;

public class Order implements Goods, Logistics {
    public void getGoodName() {
        System.out.println("得到商品名称。");
    }

    public void getStock() {
        System.out.println("得到商品库存。");
    }

    public void getLogisticsConpany() {
        System.out.println("得到物流公司。");
    }
}
