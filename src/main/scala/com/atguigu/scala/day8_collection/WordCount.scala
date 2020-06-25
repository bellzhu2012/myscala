package com.atguigu.scala.day8_collection

import java.io._

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks

/**
  * @Author: lenovo
  * @Time: 2020/5/27 16:01
  * @Description:
  * @Modified By: lenovo
  */
object WordCount {
  def main(args: Array[String]): Unit = {
    val reader: BufferedReader = new BufferedReader(new FileReader(new File("input/wordcount.txt")))
    val list  = new ListBuffer[String]()
    Breaks.breakable{
      while(true){
        val str = reader.readLine()
        if (str == null){
          Breaks.break
        }
        list.append(str)
      }
    }
    println(list)
    val words: ListBuffer[String] = list.flatMap(_.split(" "))
    println(words)
    //    val sortedWords = words.sortBy(word=>word)
    //    println(sortedWords)
    val groupBy: Map[String, ListBuffer[String]] = words.groupBy(word => word)

    println(groupBy)
    val ks: Iterator[String] = groupBy.keys.iterator
    val vs: Iterator[Int] = groupBy.values.map(list => list.length).iterator

    val map = mutable.Map[String, Int]()
    while(ks.hasNext){
      map.put(ks.next, vs.next)
    }
    println(map)


    reader.close()
    
  }

}
