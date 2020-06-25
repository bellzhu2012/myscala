package com.atguigu.scala.chapter1

import scala.io.Source


object ScalaOutput {
  def main(args: Array[String]): Unit = {
    val strings = Source.fromFile("input/hello.txt").getLines()
    while (strings.hasNext){
      println(strings.next())
    }
  }
}
