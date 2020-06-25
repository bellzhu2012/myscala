package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/28 12:25
  * @Description:
  * @Modified By: lenovo
  */
object Scala_Collection_ClassQuiz {
  def main(args: Array[String]): Unit = {
    //    要求 ： 1. 将数据进行WordCount后排序取前三名！ 2. 使用2种不同的方式
    val list: List[(String, Int)] = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )
    // 将元组拆分成字符串
    val list1: List[String] = list.map(tuple => {
      tuple._1 + (" " +  tuple._1) * (tuple._2 -1)
    })
//    println(list1)
    // 将字符串拆分成单词
    val list2: List[String] = list1.flatMap(_.split(" "))
//    println(list2)

    // 将字符串list按照单词分组
    val map: Map[String, List[String]] = list2.groupBy(s => s)
//    println(map)
    // 将map转换为list
    val list3: List[(String, List[String])] = map.toList
    // 将list中的tuple第二个元素List进行统计，转化为Int
    val list4: List[(String, Int)] = list3.map(tuple => {
      (tuple._1, tuple._2.length)
    })
//    println(list4)
    // 排序
    val list5 = list4.sortBy(tuple => {
      -tuple._2
    })
//    println(list5) // List((hello,10), (spark,6), (scala,3), (hive,1))
    // 获取前三名
    val finalList = list5.take(3)
    println(finalList)
  }
}
