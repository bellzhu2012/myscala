package com.atguigu.scala.day8_collection

import scala.collection.mutable.ArrayBuffer

/**
  * @Author: lenovo
  * @Time: 2020/5/27 19:55
  * @Description:
  * @Modified By: lenovo
  */
object Scala03_Collection_Array2 {
  def main(args: Array[String]): Unit = {
    // 包：scala.collection.mutable.ArrayBuffer
    val array = new ArrayBuffer[String]()
    array.append("a")
    array.append("b")

    println(array)
    println(array.mkString(":"))
    for( i <- array){
        println(i)
    }
  }

}
