package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:39
  * @Description:
  * @Modified By: lenovo
  */
object Scala05_Transform4 {
  def main(args: Array[String]): Unit = {
    val user = new User
    user.insertUser()
    user.updateUser()
  }
  // 隐式类
  // scala 2.10版本中增加的功能
  // 构造参数必须存在且只有一个参数，用于类型转换
  // 参数类型（User） => 当前类型（UserExt）
  implicit class UserExt(user : User){
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
