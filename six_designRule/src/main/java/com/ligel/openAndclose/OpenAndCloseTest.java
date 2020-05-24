package com.ligel.openAndclose;

import com.ligel.openAndclose.mpl.EnhanceBird;
import com.ligel.openAndclose.mpl.RedBird;

public class OpenAndCloseTest {
    public static void main(String[] args) {
        System.out.println("我是原始版的鸟！");
        Bird bird=new RedBird();
        bird.fly();
        bird.call();

        System.out.println("我是加强版的鸟，加入了新的本领！！！");
        EnhanceBird enhanceBird1 =new EnhanceBird();
        enhanceBird1.call();
        enhanceBird1.fly();
        enhanceBird1.swim();

    }
}
