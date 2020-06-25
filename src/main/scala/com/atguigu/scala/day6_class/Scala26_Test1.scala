package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 9:26
  * @Description:
  * @Modified By: lenovo
  */
object Scala26_Test1 {
  def main(args: Array[String]): Unit = {
    val dept0 = Dept04.getInstance()
    val dept1 = Dept04.getInstance()
    println(dept0 eq dept1)
  }

}
class Dept04 private{

}
object Dept04 {
  val dept = new Dept04
  def getInstance()={
    dept
  }
}
