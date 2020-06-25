package com.atguigu.scala.chapter12

import scala.util.matching.Regex

/**
  * @Author: lenovo
  * @Time: 2020/6/1 12:30
  * @Description:
  * @Modified By: lenovo
  */
object ScalaRegex1 {
  def main(args: Array[String]): Unit = {
//    val pattern: Regex = "Scala".r
//    val str = "Scala is a scala Language"
//    val maybeString: Option[String] = pattern.findFirstIn(str)
//    println(maybeString.getOrElse(0))
//    val iterator: Regex.MatchIterator = pattern.findAllIn(str)
//    iterator.foreach(println)
    val pattern :Regex = "s|Scala".r
    val str = "Scala is a scala Language"
    val matches: Iterator[Regex.Match] = pattern.findAllMatchIn(str)

    while(matches.hasNext){
      println(matches.next())
    }
  }
}
