package com.example.bean;

import lombok.Data;


@Data
public class User {
    private Integer id;
    private String name;
    //userName   字段：user_name
    private int score;
    //alt+insert  toString/构造器/getXX/hash。。。。
}
