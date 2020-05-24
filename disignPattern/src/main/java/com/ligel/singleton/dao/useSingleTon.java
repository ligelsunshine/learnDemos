package com.ligel.singleton.dao;

public class useSingleTon {
    public static void main(String[] args) {

        Runnable stack= new Runnable() {
            public void run() {
                HungrySingleton.getInstance();
            }
        };
        //线程01
        Thread thread01= new Thread(stack);
        //线程02
        Thread thread02= new Thread(stack);
        //线程03
        Thread thread03= new Thread(stack);
        thread01.start();
        thread02.start();
        thread03.start();
        System.out.println("线程"+thread01.getName()+":"+thread01.getState());
        System.out.println("线程"+thread02.getName()+":"+thread02.getState());
        System.out.println("线程"+thread03.getName()+":"+thread03.getState());
    }
}
