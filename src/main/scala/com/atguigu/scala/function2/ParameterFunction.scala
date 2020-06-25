package com.atguigu.scala.function2

/**
  * @Author: lenovo
  * @Time: 2020/5/20 21:53
  * @Description:
  * @Modified By: lenovo
  */
object ParameterFunction {
  def main(args: Array[String]): Unit = {
    def fun1() : String = {
      "zhangsan"
    }
    val aaa = fun1
//    val b = fun1 _
    val bbb : ()=>String = fun1
    println(aaa)
    println(bbb)
    println(bbb())
  }

}
