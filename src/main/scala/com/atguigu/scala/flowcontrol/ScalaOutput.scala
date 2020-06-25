package com.atguigu.scala.flowcontrol

import java.io.{File, FileOutputStream, PrintWriter}



/**
  * @Author: lenovo
  * @Time: 2020/5/19 18:34
  * @Description:
  * @Modified By: lenovo
  */
object ScalaOutput {
  def main(args: Array[String]): Unit = {
    val fos : FileOutputStream = new FileOutputStream(new File("output/test.txt"),true)
    val writer = new PrintWriter(fos)
    writer.write("\n")
    writer.write("hello world")
    writer.flush()
    fos.close()
    writer.close()
  }

}
