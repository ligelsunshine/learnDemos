package com.ligel.test;

import java.time.LocalDateTime;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: WaitNotifyTest
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 16:15
 */


/*
* wait():让程序暂停执行，相当于让当前，线程进入当前实例的等待队列，
* 这个队列属于该实例对象，所以调用notify也必须使用该对象来调用，
* 不能使用别的对象来调用。调用wait和notify必须使用同一个对象来调用。
*
* */
public class WaitNotifyTest {
    public void register() throws InterruptedException {
        System.out.println(LocalDateTime.now() + " " +
                Thread.currentThread().getName() + "等待，有人在注册！");
        this.wait();
        System.out.println(LocalDateTime.now() + " " +
                Thread.currentThread().getName() + "好了，注册完成");

    }
    private synchronized void notifyRegister(){
        this.notify();
        System.out.println(LocalDateTime.now() + " " +
                Thread.currentThread().getName() + "通知完成！");
    }
    public static void main(String[] args) {
        WaitNotifyTest waitNotifyTest= new WaitNotifyTest();
        //请求注册线程01
         new Thread(()->{
             try {
                 waitNotifyTest.register();
             }catch (Exception e){
                 e.printStackTrace();
             }
         }).start();
         //请求注册线程02
        new Thread(()->{
            try {
                waitNotifyTest.register();
            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println(LocalDateTime.now() + "\t" + Thread.currentThread().getName() + "\t睡觉1秒中，目的是让上面的线程先执行，即先执行wait()");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            waitNotifyTest.notifyRegister();
        }).start();
    }

}
