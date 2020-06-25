package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 18:22
  * @Description:
  * @Modified By: lenovo
  */
object ScalaString {
  def main(args: Array[String]): Unit = {
    val name : String = "scala"
    val  substr = name.substring(0,3)
//    println(substr)
    // 字符拼接
//    println("hello " + name)
    // 传值字符串
//    printf("hello %s\n",name)
    // 插值字符串
//    println(s"hello $name")
    // 多行字符串
    println(
      s"""
         | hello
         | $name
       """.stripMargin
    )
  }

}
