package com.ligel.entity;

import lombok.Data;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: User
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/24 12:47
 */
@Data
public class User {
    private String id;
    private String name;
    private Integer age;

    public User(String id, String name, int age) {
        this.id=id;
        this.name= name;
        this.age= age;
    }
}
