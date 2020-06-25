package com.atguigu.scala.day8_collection

import scala.collection.mutable.ListBuffer

/**
  * @Author: lenovo
  * @Time: 2020/5/28 12:42
  * @Description:
  * @Modified By: lenovo
  */
object Scala_Collection_ClassQuiz1 {
  def main(args: Array[String]): Unit = {
    //    要求 ： 1. 将数据进行WordCount后排序取前三名！ 2. 使用2种不同的方式
    val list: List[(String, Int)] = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )
    // 将tuple的第一个元素先拆分
    val list1 = list.map(tuple => {
      (tuple._1.split(" ").toList, tuple._2)
    })
//    println(list1) //List((List(hello),4), (List(hello, spark),3), (List(hello, spark, scala),2), (List(hello, spark, scala, hive),1))
    def fun(tuple: (List[String],Int)) = {
      val buffer = new ListBuffer[String]
//      println(list)
      var num = tuple._2
//      println(num)
      for (word <- tuple._1) {
        for (j <- Range(1,num+1)) {
          buffer.append(word)
        }
      }
//      println(buffer)
      buffer
    }
    // 将所有tuple拆分为单词
    val list2 = list1.flatMap(fun)
//    println(list2)
    // 排序
    val list3 = list2.sortBy(str => str)
    // 去重
    val set = list3.toSet
//    println(list3)
//    println(set)
    // 使用可变list记录最终统计结果
    val list4 = new ListBuffer[(String, Int)]
    for (elem <- set) {
      val start = list3.indexOf(elem)
      val end = list3.lastIndexOf(elem)
      list4.append((elem,end-start+1))
    }
//    println(list4)
    // 排序，取头部三名
    val finalList = list4.sortBy(tuple => -tuple._2).take(3)
    println(finalList)
  }
}
