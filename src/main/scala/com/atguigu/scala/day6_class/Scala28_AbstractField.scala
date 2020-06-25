package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 11:00
  * @Description:
  * @Modified By: lenovo
  */
object Scala28_AbstractField {
  def main(args: Array[String]): Unit = {
    val dept = new SubDept06
    println(dept.name)
    println(dept.age)
  }

}
abstract class Dept06{
  var name:String
  val age = 10
}
class SubDept06 extends Dept06{
  var name = "lisi"
  override val age = 20
}
