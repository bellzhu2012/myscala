package com.atguigu.scala.chapter1


object ScalaString2 {
  def main(args: Array[String]): Unit = {
    val name : String = "python"
    val substring : String = name.substring(0,2)
    println(substring)
    println("hi " + name)
    printf("hello %s\n", name)
    println(s"how do you do $name")
    println(
      s"""
         |hello
         |$name
       """.stripMargin)

  }
}
