package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 21:26
  * @Description:
  * @Modified By: lenovo
  */
object Svala05_Match4 {
  def main(args: Array[String]): Unit = {
    val list = List(("a",1), ("b",2), ("c",3))
//    val newList = list.map(
//      (tuple) => {
//        (tuple._1, tuple._2 * 2)
//      })
//    println(newList)
    // 模式匹配是，小括号要变成大括号
    // case后面的小括号不是参数列表的意思，表示元组
    // 模式匹配一般就在一个参数的时候使用
    val newList1 = list.map {
      case (word, count) => {
        (word, count * 2)
      }
    }
//    println(newList1)
    list.filter{
      case (word, count) => {
        count == 2
      }
    }

    list.flatMap{
      case (word, count) =>{
        List(count)
      }
    }

    val (id, name, age) = (1, "zhangsan", 30)
    println(id)
    println(name)
    println(age)
  }
}
