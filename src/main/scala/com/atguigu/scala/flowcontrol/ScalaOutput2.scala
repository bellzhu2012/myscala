package com.atguigu.scala.flowcontrol

import java.io.{File, FileOutputStream, PrintWriter}
/**
  * @Author: lenovo
  * @Time: 2020/5/19 20:30
  * @Description:
  * @Modified By: lenovo
  */
object ScalaOutput2 {
  def main(args: Array[String]): Unit = {
    val file : File = new File("output/test.txt")
    val output : FileOutputStream = new FileOutputStream(file,true)
    val writer : PrintWriter = new PrintWriter(output)
    writer.write("\n")
    writer.write("hello java")
    writer.flush()
    writer.close()

  }

}
