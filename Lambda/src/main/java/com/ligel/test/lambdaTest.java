package com.ligel.test;

import com.ligel.entity.User;
import com.ligel.interfaces.NoReturnNoParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: lambdaTest
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 21:18
 */
public class lambdaTest {
    public static void main(String[] args) {
        NoReturnNoParam noReturnNoParam=()->{
            System.out.println("第一个lambdal表达式");
        };
        noReturnNoParam.method();

        //1. 遍历集合
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        List<User> lists= new ArrayList<>();
        for(int i=0;i<5;i++){
            lists.add(new User(i,"固定的",i,"中国"));
        }
        lists.forEach(System.out::println);
        //我比较常用的
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        lists.forEach(data->{
            //在这里可以进行一些数据的封装
            System.out.println("也可以打印："+data);
        });

        //2. 创建线程
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        new Thread(()->{
            for (int i=0; i<5; i++){
                System.out.println("在这里搞事情："+i);
            }
        }).start();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //3. 删除集合中国满足个条件的集合
        lists.removeIf(data->data.getId()==1);
        //4. 集合元素排序
        lists.sort((a,b)->a.getAge()-b.getAge());
        lists.forEach(data-> System.out.println("删除排序后："+data));

    }


}
