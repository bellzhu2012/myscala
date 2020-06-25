package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/25 22:07
  * @Description:
  * @Modified By: lenovo
  */
object Scala20_Method_Instance2 {
  def main(args: Array[String]): Unit = {
    val user = new User("lisi")
    println(user.username)
//    println(user.name)
    val emp = new Emp("lisi")
    println(emp.name)
  }

  class User(name : String){
    val username : String = name
  }
  class Emp(val name : String){}
}
