package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 21:33
  * @Description:
  * @Modified By: lenovo
  */
object Scala5_Match44 {
  def main(args: Array[String]): Unit = {
    val (id, name, age) = (1, "zhangsan", 30)
//    println(id)
//    println(name)
//    println(age)

    val list = List(("a",1), ("b",2), ("c",3))
//    val newList = list.map(
//      (tuple) => {
//        (tuple._1, tuple._2 * 2)
//      })
//    println(newList)
    val newList = list.map {
      case (word, count) => {
        (word, count * 2)
      }
    }
    println(newList)

    val filt = list.filter {
      case (word, count) => {
        count == 2
      }
    }
    println(filt)
    val countList = list.flatMap {
      case (word, count) => {
        List(count)
      }
    }
    println(countList)
  }
}
