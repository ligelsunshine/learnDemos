package com.ligel.test;

import com.ligel.domain.SecondThread;
import com.ligel.domain.ThreeThread;
import com.ligel.domain.UserThread;
import com.ligel.entity.User;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: CreateThread
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 12:34
 */
public class CreateThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1. 创建线程的第一种方法，自定义线程类继承Thread类，重写run()方法
        Thread thread = new UserThread();
        thread.start();

        // 2. 实现Runable接口，重写其中的run()方法，将Runalbe对象参数给Thread
        Thread thread01 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is my second Thread!");
            }
        });
        thread01.start();
        /*另一种*/
        Runnable task = new SecondThread();
        Thread thread1_1 = new Thread(task);
        thread1_1.start();

        /*
         * 3.
         *   实现Callable接口，重写call()方法
         *   然后包装成java.util.concurrent.FutureTask
         *   再然后包装成Thread
         * */
        ThreeThread threeThread = new ThreeThread();
        FutureTask<User> futureTask = new FutureTask<>(threeThread);
        new Thread(futureTask).start();
        User u = futureTask.get();
        System.out.println("传来的user:" + u);

        //Thread中一些常用的方法
        Thread concurentThread = Thread.currentThread();
        System.out.println("名称：" + concurentThread.getName());
        System.out.println("id:" + concurentThread.getId());
        System.out.println("优先级：" + concurentThread.getPriority());
        System.out.println("状态：" + concurentThread.getState());

        // 写个循环看看
        /*线程A*/
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-A").start();

        /*线程B*/
        new Thread(() -> {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " " + j);
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-B").start();

        //关于sleep()，interrupt()
        /*
         * sleep()是指定时长内线程进行休眠，但是其任然保存着锁，时间到可以立即执行
         * interrupt()是把睡眠的线程唤醒
         * */
        Thread sleepThread = new Thread(() -> {
            System.out.println(LocalDateTime.now() + " " + Thread.currentThread().getName() + "被阻塞了");
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }


        });
        sleepThread.start();
        Thread.sleep(2000);
        new Thread(()-> {
            System.out.println(LocalDateTime.now() + "\t" + Thread.currentThread().getName() + "\t醒醒，醒醒，别睡了，起来干活了！！！");
            // 无需获取锁就可以调用interrupt
            sleepThread.interrupt();
        }).start();
    }
}
