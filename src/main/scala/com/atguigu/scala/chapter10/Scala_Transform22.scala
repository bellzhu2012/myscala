package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:21
  * @Description:
  * @Modified By: lenovo
  */
object Scala_Transform22 {
  def main(args: Array[String]): Unit = {
    implicit def trasform(user : User)={
      new Parent
    }
    val user = new User
    user.insertUser()
    user.updateUser()
  }
  class Parent {
    def updateUser(): Unit = {
      println("update user...")
    }
  }
  class User {

    def insertUser(): Unit = {
      println("insert user...")
    }
  }
}
