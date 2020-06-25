package com.atguigu.scala.chapter11

/**
  * @Author: lenovo
  * @Time: 2020/6/1 13:55
  * @Description:
  * @Modified By: lenovo
  */
object ScalaGeneric2 {
  def main(args: Array[String]): Unit = {
    // 泛型协变
    val test1 : Test[User] = new Test[User]
//    val test2 : Test[User] = new Test[Parent]
    val test3 : Test[User] = new Test[SubUser]
  }
  class Test[+T]{}
  class Parent{}
  class User extends Parent{}
  class SubUser extends User{}
}
