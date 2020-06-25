package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/25 22:20
  * @Description:
  * @Modified By: lenovo
  */
object Scala23_Method_Instance5 {
  def main(args: Array[String]): Unit = {
    val user = new User("wangwu")
  }
  class Person(name:String){
    println("AAA")
    def this()={
      this("lisi")
      println("BBB")
    }
  }
  class User() extends Person("张三"){
    println("CCC")
    def this(name : String) = {
      this()
      println("DDD")
    }
  }
}
