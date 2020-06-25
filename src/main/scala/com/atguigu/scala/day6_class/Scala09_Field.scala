package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 8:51
  * @Description:
  * @Modified By: lenovo
  */
object Scala09_Field {
  def main(args: Array[String]): Unit = {
    val user = new User09
    println(user.name)
    println(user.age)
    println(user.sex)
//    user.name = "张三"
    user.name_$eq("李四")
    println()


  }

}
class User09{
  // 属性
  var name : String = _
  var age : Int = _
  val sex : String = "male"
}
