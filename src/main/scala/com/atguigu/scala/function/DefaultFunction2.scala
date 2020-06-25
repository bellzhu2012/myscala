package com.atguigu.scala.function

/**
  * @Author: lenovo
  * @Time: 2020/5/20 20:18
  * @Description:
  * @Modified By: lenovo
  */
object DefaultFunction2 {
  def main(args: Array[String]): Unit = {
    def fun(passwd:String = "000000", name :String) : Unit = {
      println(name + "," + passwd)
    }
    fun("123123", "zhangsan")
    fun(name="lisi")
  }

}
