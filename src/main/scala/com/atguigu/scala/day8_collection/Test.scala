package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 12:19
  * @Description:
  * @Modified By: lenovo
  */
object Test {
  def main(args: Array[String]): Unit = {
    val user1: User = new User
    println("user1: " + user1)
    val user2: User = user1.clone()
    println("user2: " + user2)
    println(user1 eq user2)
  }
}
class User extends Cloneable {
  var name = "zhangsan"
  var age = 20
  override def clone(): User = {
    var user : User = null
    try{
      user = super.clone().asInstanceOf[User]
    }catch{
      case ex : Exception => println(ex.getMessage)
    }
    user
  }

  override def toString: String =  s"User{name=$name, age=$age}"
}
