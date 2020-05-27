package com.ligel.test;

import com.ligel.domain.SecondThread;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: InterruptAndIsinterrupt
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 20:07
 */

/*
* 在线程没有启动时，默认时false
*interrupted()方法还不好调用，时静态方法判断当前线程是否中断，能够指定判断哪个线程吗？
* 直接用Isinterrupt()方法就行了。
* */
public class InterruptAndIsinterrupt {
    public static void main(String[] args) {
        Thread thread= new Thread(new SecondThread());
        thread.start();
        Boolean flag= thread.isInterrupted();
        System.out.println("中断前："+flag);
        thread.interrupt();
        flag=thread.isInterrupted();
        System.out.println("中断后："+flag);
    }


}
