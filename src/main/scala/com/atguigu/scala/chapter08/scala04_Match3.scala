package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 20:53
  * @Description:
  * @Modified By: lenovo
  */
object scala04_Match3 {
  def main(args: Array[String]): Unit = {
    // 使用case关键字声明的类，称之为样例类
    // 专门用于匹配对象
    // 1 样例类在编译时，会自动生成伴生对象以及apply方法
    // 2 样例类的构造参数默认使用val声明，所以参数其实就是类的属性。
    // 如果想要修改属性，需要显式的将属性使用var声明
    // 3 样例类会自动生成unapply方法
    // 样例类自动实现可序列化特质
//    val user = User("zhangsan", 20)
    //    val result = user match{
    //      case User("zhangsan", 20) => "yes"
    //      case _ => "no"
    //    }
    //    println(result)
    val emp = Emp("list",30)
    val result = emp match{
      case Emp("list",30) => "yes"
      case _ =>"no"
    }
    println(result)

  }
  class User(val name:String, val age:Int){}
  object User{
    def apply(name:String, age:Int)={
      new User(name, age)
    }
    def unapply(user:User) : Option[(String, Int)]={
      Option((user.name, user.age))
    }
  }
  case class Emp(var name:String, var age:Int){}
}

