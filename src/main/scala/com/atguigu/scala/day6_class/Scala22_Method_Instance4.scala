package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/25 22:14
  * @Description:
  * @Modified By: lenovo
  */
object Scala22_Method_Instance4 {
  def main(args: Array[String]): Unit = {
    val user = new User()
    val emp = new Emp("zhangsan")
  }
  class Person(name : String){
    println(s"Person name = $name")
  }
  class User extends Person("lisi"){
    println("user...")
  }
  class Emp(name:String) extends Person(name){
    println("emp...")
  }
}
