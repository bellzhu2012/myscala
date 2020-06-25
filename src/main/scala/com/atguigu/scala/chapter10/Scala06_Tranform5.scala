package com.atguigu.scala.chapter10

import com.atguigu.scala.day6_class.Test

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:50
  * @Description:
  * @Modified By: lenovo
  */
object Scala06_Tranform5 extends Test{
  def main(args: Array[String]): Unit = {
    // 隐式转换查找规则
    // 不能放在当前对象的顶级作用域中（top-level）(编译后形成两个class文件，找不到)
    // 1 当前代码的作用域中
    // 2 当前代码的上级作用域
    // 3当前代码的包对象
    // 4 当前代码的父类或特质


    val user = new User
    user.insertUser()
    user.updateUser()
  }
//  implicit class UserExt(user:User){
//    def updateUser()={
//      println("update user...")
//    }
//  }
//  class User{
//    def insertUser()={
//      println("insert user...")
//    }
//  }
}
class Test{
  implicit class UserExt(user:User){
    def updateUser()={
      println("update user...")
    }
  }
}
//class User extends Test {
//  def insertUser()={
//    println("insert user...")
//  }
//}
//class Test{
//  implicit class UserExt(user:User){
//    def updateUser()={
//      println("update user...")
//    }
//  }
  class User{
    def insertUser()={
      println("insert user...")
    }
  }
//}

