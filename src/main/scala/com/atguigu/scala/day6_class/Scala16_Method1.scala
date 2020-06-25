package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/25 21:49
  * @Description:
  * @Modified By: lenovo
  */
object Scala16_Method1 {
  def main(args: Array[String]): Unit = {
    val user1= new User16()
    val user2 = User16.apply()
    val user3 = User16()
  }
}
class User16{}

object User16{
  def apply() = {
    new User16
  }
}
