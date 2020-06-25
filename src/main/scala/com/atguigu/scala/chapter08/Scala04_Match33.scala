package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 21:21
  * @Description:
  * @Modified By: lenovo
  */
object Scala04_Match33 {
  def main(args: Array[String]): Unit = {
//    val user = User("zhangsan",20)
//    val result = user match{
//      case User("zhangsan",20) =>"yes"
//      case _ => "no"
//    }
//    println(result)
    val emp = Emp("lisi",30)
    val result = emp match {
      case Emp("lisi", 30) => "yes"
      case _ => "no"
    }
    println(result)
  }
  case class Emp(var name:String, var age:Int){}
  class User(val name:String, val age:Int){}
  object User{
    def apply(name:String, age:Int)={
      new User(name, age)
    }
    def unapply(user : User)={
      Option((user.name, user.age))
    }
  }
}
