package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/30 8:15
  * @Description:
  * @Modified By: lenovo
  */
object Scala31_Collection_Queue {
  def main(args: Array[String]): Unit = {
    val que = new mutable.Queue[Int]()
    que.enqueue(1)
    que.enqueue(2)
    println(que.dequeue())
  }
}
