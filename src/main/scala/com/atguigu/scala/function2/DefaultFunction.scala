package com.atguigu.scala.function2

/**
  * @Author: lenovo
  * @Time: 2020/5/20 21:22
  * @Description:
  * @Modified By: lenovo
  */
object DefaultFunction {
  def main(args: Array[String]): Unit = {
//    def fun9(name : String, passwd : String = "000000") : Unit = {
//      println(name + "," + passwd)
//    }
//    fun9("zhangsan")
//    fun9("zhangsan", "123123")
    def fun10(passwd : String = "000000", name : String): Unit ={
      println(name + "," + passwd)
    }
    fun10(name="zhangsan")
  }

}
