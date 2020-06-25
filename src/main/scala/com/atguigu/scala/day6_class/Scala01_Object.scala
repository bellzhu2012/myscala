package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 8:44
  * @Description:
  * @Modified By: lenovo
  */
object Scala01_Object {
  def main(args: Array[String]): Unit = {
    val dept = new Dept01()

    val user = new User01()
    user.dept = dept
    user.name = "lisi"
    user.test()
    println(s"${user.name},${user.dept.name}")
  }

}
class Dept01{
  var name : String = "开发部门"
}
class User01{
  var dept : Dept01 = null
  var name : String = "zhangsan"
  def test(): Unit = {
    println("user test...")
  }
}
