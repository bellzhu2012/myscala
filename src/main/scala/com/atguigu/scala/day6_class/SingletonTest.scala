package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 21:38
  * @Description:
  * @Modified By: lenovo
  */
object SingletonTest {
  def main(args: Array[String]): Unit = {
    val s1 : Singleton = Singleton()
    val s2 : Singleton = Singleton()
    val s3 : Singleton = Singleton()
    println(s1)
    println(s2)
    println(s3)
  }
}
class Singleton{
}
object Singleton{
  val obj = new Singleton
  def apply(): Singleton = {
    obj
  }
}
