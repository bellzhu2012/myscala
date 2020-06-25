package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 20:21
  * @Description:
  * @Modified By: lenovo
  */
object ScalaString2 {
  def main(args: Array[String]): Unit = {
    val name : String = "scala"
    val subname : String = name.substring(0,2)
    println(subname)
    // 传值字符串
    printf("hello %s\n", name)
    // 插值字符串
    println(s"hello $name")
    // 多行字符串
    println(
      s"""
         |hello
         |$name
       """.stripMargin)

  }

}
