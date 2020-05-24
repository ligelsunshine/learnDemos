package com.ligel.liskov;

import com.ligel.liskov.child.BlackBird;
import com.ligel.liskov.child.RedBird;
import com.ligel.liskov.parent.Bird;

public class liskovTest {
    public static void main(String[] args) {
        RedBird redBird=new RedBird();
        Bird blackBird=new BlackBird();
        System.out.println("黑鸟的叫声！~~~~~~~~~~~~~~~~~~~");
        blackBird.call();
        System.out.println("红鸟的叫声！~~~~~~~~~~~~~~~~~~~");
        redBird.call();
    }
}
