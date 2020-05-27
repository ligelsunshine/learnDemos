package com.ligel.entity;

import lombok.Data;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: User
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/25 20:34
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String address;

    public User(int id, String name, int age, String address) {
        this.id= id;
        this.name= name;
        this.age= age;
        this.address= address;
    }
}
