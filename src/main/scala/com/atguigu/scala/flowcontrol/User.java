package com.atguigu.scala.flowcontrol;

import java.io.Serializable;

/**
 * @Author: lenovo
 * @Time: 2020/5/19 20:00
 * @Description:
 * @Modified By: lenovo
 */
public class User implements Serializable {
    public int age = 10;
    public String name = "zhangsan";

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
