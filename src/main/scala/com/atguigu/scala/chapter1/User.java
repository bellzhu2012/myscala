package com.atguigu.scala.chapter1;

import java.io.Serializable;

/**
 * @Author: lenovo
 * @Time: 2020/5/18 21:13
 * @Description:
 * @Modified By: lenovo
 */
public class User implements Serializable{
    // serialUID已经不需要添加，系统会自动生成
    public long serialUID = 124234234L;
    public int age = 20 ;
    public String name = "lisi";

    @Override
    public String toString() {
        return "User{" +
                "serialUID=" + serialUID +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
