package com.atguigu.scala.chapter11

/**
  * @Author: lenovo
  * @Time: 2020/6/1 20:43
  * @Description:
  * @Modified By: lenovo
  */
object ScalaGeneric4 {
  def main(args: Array[String]): Unit = {
      // 泛型边界
    val parent = new Parent
    val user = new User
    val sub = new SubUser
//    test[User](parent)
    test[User](user)
    test[User](sub)
  }
  def test[A](a : A)={
    println(a)
  }
  class Parent {
  }
  class User extends Parent{
  }
  class SubUser extends User {
  }

}
