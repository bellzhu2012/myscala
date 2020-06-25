package com.atguigu.scala.chapter1


object ScalaString {
  def main(args: Array[String]): Unit = {
    val name : String = "scala"
    val subname : String = name.substring(0,2)
    println(subname)
    println("+++" + subname + "++++")
    printf("name1=%s\n",name)
    println(s"name2=$name")
    println(
      s"""| hello
         | $name""".stripMargin)
  }
}
