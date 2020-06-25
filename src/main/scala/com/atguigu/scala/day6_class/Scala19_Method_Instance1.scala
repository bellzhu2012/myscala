package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/25 22:03
  * @Description:
  * @Modified By: lenovo
  */
object Scala19_Method_Instance1 {
  def main(args: Array[String]): Unit = {
    val user1 = new User()
    val user2 = new User("张三")
    val user3 = new User("李四",22)
    println(user1)
    println(user2)
    println(user3)
  }
  class User(){
    println("xxxxx")
    def this(name:String)={
      this()
      println("aaa")
    }
    def this(name:String,age:Int)={
      this(name)
      println("bbb")
    }
  }
}
