package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 19:51
  * @Description:
  * @Modified By: lenovo
  */
object Scala02_Collection_Array1 {
  def main(args: Array[String]): Unit = {
    // 包：scala.Array
    val array = Array(1,2,3,4)
    // 添加元素
    val newArray1: Array[Int] = array :+ 5
//    val newArray2: Array[Any] = newArray2 :+ "5"
    println(array.mkString(":"))
    println(newArray1.mkString(":"))
    //    println(newArray2.mkString(":"))
        val newArray2: Array[Int] = array ++ newArray1
    println(newArray2.mkString(":"))
  }
}
