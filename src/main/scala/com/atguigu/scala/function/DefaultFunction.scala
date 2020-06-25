package com.atguigu.scala.function

/**
  * @Author: lenovo
  * @Time: 2020/5/20 20:15
  * @Description:
  * @Modified By: lenovo
  */
object DefaultFunction {
  def main(args: Array[String]): Unit = {
    def fun(name : String, password : String = "000000") : Unit = {
      println(name + "," + password)
    }
    fun("zhangsan")
    fun("zhangsan", "123123")
  }

}
