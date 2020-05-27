package com.ligel.domain;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: SecondThread
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 12:41
 */
public class SecondThread implements Runnable {
    @Override
    public void run() {
        System.out.println(" this is my another second thread!");
    }
}
