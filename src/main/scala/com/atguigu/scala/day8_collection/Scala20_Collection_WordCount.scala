package com.atguigu.scala.day8_collection

import scala.io.Source

/**
  * @Author: lenovo
  * @Time: 2020/5/28 11:58
  * @Description:
  * @Modified By: lenovo
  */
object Scala20_Collection_WordCount {
  def main(args: Array[String]): Unit = {
    // Scala - WordCount
    // 需求：将文件中单词统计出现的次数并排序取前三名
    // spark => 8 wordcount
    // 所有统计需求中，都可以将大的需求拆分成小需求，小需求中基本上很多都wordcount类型

    // 代码实现：就是翻译，将文字用代码翻译过来
    // TODO 1. 从文件中获取数据，获取一行一行的字符串
    // List(1,2,3,4)
    // 可迭代的集合都可以互相转换
    val list: List[String] = Source.fromFile("input/wordcount.txt").getLines().toList
    println(list)
    val words: List[String] = list.flatMap(_.split(" "))
    println(words)
    val map: Map[String, List[String]] = words.groupBy(word => word)
    println(map)
    val tupleList : List[(String,List[String])] = map.toList
   println(tupleList)
    val finalList = tupleList.map(tuple => {
      (tuple._1, tuple._2.length)
    })
    println(finalList)
    val list1 = finalList.sortBy(tuple => {
      (-tuple._2, tuple._1)
    })
    println(list1)
    println(list1.take(3))
  }
}
