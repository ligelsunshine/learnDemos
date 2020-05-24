package com.ligel.singleton.dao;

public class LazySingleton {
    //volatile 让instance在所有线程同都是可见的，就是一更新，立即通知这些线程
    private static volatile LazySingleton instance = null;
    private LazySingleton(){}//私有构造函数
    //创建获得该单例方法加锁
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance= new LazySingleton();
            System.out.println("该单例被创建");
        }
        else {

            System.out.println("该单例已经创建了！");
        }
        return instance;
    }

}
