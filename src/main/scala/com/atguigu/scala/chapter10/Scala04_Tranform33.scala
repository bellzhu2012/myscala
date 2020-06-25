package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:34
  * @Description:
  * @Modified By: lenovo
  */
object Scala04_Tranform33 {
  def main(args: Array[String]): Unit = {
    def regUser(name : String)(implicit password : String = "123123")={
      println(s"用户名：$name,密码：$password")
    }
    implicit val password = "111111"
    regUser("lisi")()
    val s = "abc"
    println(s(2))
  }
}
