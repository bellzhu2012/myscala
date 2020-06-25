package com.atguigu.scala.day8_collection

import scala.collection.immutable

/**
  * @Author: lenovo
  * @Time: 2020/5/27 20:15
  * @Description:
  * @Modified By: lenovo
  */
object Scala07_Collection_Seq {
  def main(args: Array[String]): Unit = {
    //Seq - 序列 - List
    // 默认情况下，scala提供的集合都是不可变的，immutable,特指长度不可变
    // 默认不可变的结合List是抽象类，无法构造对象
    // 如果想要构造List对象，可以采用apply的方式
    val list: List[Int] = List(1,2,3,4)
    // 处理数据
    val newList1: List[Int] = list :+ 5
    val newList2: List[Int] = 5 +: list
    println(list)
    println(newList1)
    println(newList2)
    val newList3: immutable.IndexedSeq[Any] = list +: "5"
    println(newList3)
    println(list.mkString(":"))
    list.foreach(println)

    println(list.mkString(":"))
  }
}
