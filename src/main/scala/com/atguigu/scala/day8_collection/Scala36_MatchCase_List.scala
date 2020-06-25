package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/30 11:09
  * @Description:
  * @Modified By: lenovo
  */
object Scala36_MatchCase_List {
  def main(args: Array[String]): Unit = {
    val list = List(("a",1),("b",2),("c",4))
//    val newList = list.map(
//      (tuple) => {
//        (tuple._1, tuple._2 * 2)
//      })
    val newList = list.map {
      case (word, count) => {
        (word, count * 2)
      }
    }

    println(newList)

  }
}
