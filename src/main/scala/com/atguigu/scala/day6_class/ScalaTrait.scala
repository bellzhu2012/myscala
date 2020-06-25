package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 21:42
  * @Description:
  * @Modified By: lenovo
  */
object ScalaTrait {
  def main(args: Array[String]): Unit = {
    new MySql
  }
}
trait Operator{
  println("operator...")
}
trait DB{
  println("db...")
}
class MySql extends DB with Operator{
  println("mysql")
}
