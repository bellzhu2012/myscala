package com.atguigu.scala.day8_collection

import scala.collection.mutable.ListBuffer

/**
  * @Author: lenovo
  * @Time: 2020/5/27 20:53
  * @Description:
  * @Modified By: lenovo
  */
object Scala09_Collection_Seq2 {
  def main(args: Array[String]): Unit = {
    // scala-seq -可变：scala.collection.mutable.ListBuffer
    val buffer1: ListBuffer[Int] = ListBuffer(1,2,3,4)
    val buffer2: ListBuffer[Int] = new ListBuffer[Int]()
    buffer2.append(1,2,3,4)
    buffer2.insert(0,-1,0)
//    println(buffer1)
//    println(buffer2)
//    buffer2.update(0,-2)
//    println(buffer2)
//    buffer2.remove(0)
//    println(buffer2)
//    buffer2.remove(0,2)
//    println(buffer2)
    buffer2.foreach(println)
    println(buffer2.mkString(":"))
  }
}
