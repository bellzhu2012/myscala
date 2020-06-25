package com.atguigu.scala.chapter1

import java.io.{File, FileOutputStream, PrintWriter}


object ScalaOutput2 {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new FileOutputStream(new File("output/test.txt"),true))
    writer.write("hello python")
    writer.close()
  }
}
