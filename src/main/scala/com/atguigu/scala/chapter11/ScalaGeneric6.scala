package com.atguigu.scala.chapter11

/**
  * @Author: lenovo
  * @Time: 2020/6/1 20:48
  * @Description:
  * @Modified By: lenovo
  */
object ScalaGeneric6 {
  def main(args: Array[String]): Unit = {
    val parent = new Parent
    val user = new User
    val sub = new SubUser
    test[Parent](parent)
    test[User](user)
//    test[SubUser](sub)

  }
  def test[A>:User](a : A)={
    println(a)
  }
  class Parent {
  }
  class User extends Parent{
  }
  class SubUser extends User {
  }

}
