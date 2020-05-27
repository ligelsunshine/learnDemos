package com.ligel.domain;

import com.ligel.entity.User;

import java.util.concurrent.Callable;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: ThreeThread
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 12:46
 */
    public class ThreeThread implements Callable<User> {
        @Override
        public User call() throws Exception {
            System.out.println("this is my three thread");
            return new User("2","ligel",10);
        }
    }
