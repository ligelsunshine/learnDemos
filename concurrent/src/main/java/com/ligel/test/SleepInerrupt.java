package com.ligel.test;

import java.time.LocalDateTime;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: SleepInerrupt
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 16:07
 */

/*
* sleep()方法就是让线程休眠指定时间
* 其实最有意思的就是调用interrupt()方法，
* 会使得sleep()方法抛出InterruptedException异常，
* 当sleep()方法抛出异常就中断了sleep的方法，从而让程序继续运行下去
*
* */
public class SleepInerrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread sleepThread = new Thread(() -> {
            System.out.println(LocalDateTime.now() + " " + Thread.currentThread().getName() + "\t被阻塞了");
            try {
                Thread.sleep(10000);
                System.out.println("被唤醒了");
            } catch (Exception e) {
                System.out.println(LocalDateTime.now() + "\t" + Thread.currentThread().getName() + "\t被叫醒了！");
            }


        });
        sleepThread.start();
        //睡眠让上面的线程先执行
//        Thread.sleep(2000);
        new Thread(()-> {
            System.out.println(LocalDateTime.now() + "\t" + Thread.currentThread().getName() + "\t醒醒，醒醒！");
            // 无需获取锁就可以调用interrupt,为什么会报错呢？
            sleepThread.interrupt();
        }).start();
    }
}
