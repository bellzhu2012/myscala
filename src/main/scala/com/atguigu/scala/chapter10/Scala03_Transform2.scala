package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:13
  * @Description:
  * @Modified By: lenovo
  */
object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {
    // 将User => Parent
    //将函数声明前增加implicit关键字，可以由编译器自动识别和自动调用
    // 隐式方法

    implicit def transform(user : User)={
      new Parent
    }
    // 1 相同的转换规则必须只能有一个
    // 2 隐式转换方法调用的时机
    // 二次编译：第一次编译出现错误时，会选择隐式转换
//    val user = new User() with Parent// 动态混入
    val user = new User()
    user.insertUser()
    user.updateUser()
  }
  class Parent{
    def updateUser()={
      println("update user...")
    }
  }
  class User{
    def insertUser()={
      println("insert user...")
    }
  }
}
