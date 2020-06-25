package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/25 22:10
  * @Description:
  * @Modified By: lenovo
  */
object Scala21_Method_Instance3 {
  def main(args: Array[String]): Unit = {
    val user = new User("zhangsan",22)
    val user1 = new User()
//    val user2 = new User("lisi")
  }
  class User private (name : String){
    println("AAA")
    def this()={
      this("lisi")
      println("BBB")
    }

    def this(name:String, age:Int)={
      this()
      println("CCC")
    }
  }
}
