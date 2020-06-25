package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:43
  * @Description:
  * @Modified By: lenovo
  */
object Scala05_Transform44 {
  def main(args: Array[String]): Unit = {
    val user = new User
    user.insertUser()
    user.updateUser()
  }
  implicit class UserExt(user :User){
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
