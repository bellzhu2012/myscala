package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 20:30
  * @Description:
  * @Modified By: lenovo
  */
object Scala23_Collection_WordCount3 {
  def main(args: Array[String]): Unit = {
    val list = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )
    // 对数据进行扁平化处理
    val wordToCountList: List[(String, Int)] = list.flatMap(
      (kv) => {
        val words = kv._1.split(" ")
        words.map(
          word => {
            (word, kv._2)
          })
      })
    // word -> count
    // ("hello", 4)
    // ("hello", 3), ("spark", 3)
    // ("hello", 2), ("spark", 2), ("scala", 2)
    // ("hello", 1), ("spark", 1), ("scala", 1), ("hive", 1)
    // 将相同的单词分在一个组中
    val wordToListMap: Map[String, List[(String, Int)]] = wordToCountList.groupBy((kv)=>{kv._1})
    // hello -> List（("hello", 4),("hello", 3),("hello", 2),("hello", 1)）
    val wordToSumMap: Map[String, Int] = wordToListMap.mapValues(
      (v) => {
        val ints: List[Int] = v.map(_._2)
        ints.sum
      })
    println(wordToSumMap)
    println(wordToSumMap.toList.sortBy(-_._2).take(3))

  }
}
