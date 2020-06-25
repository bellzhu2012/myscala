package com.atguigu.scala.chapter09

import java.io.FileInputStream

/**
  * @Author: lenovo
  * @Time: 2020/5/31 9:25
  * @Description:
  * @Modified By: lenovo
  */
object Scala01_Exception {
  def main(args: Array[String]): Unit = {
    try{
//      val i = 0
//      val j = 10 / i
//      val s : String = null
//      println(s.substring(1))
      new FileInputStream("xxxx")
    }catch{
      case ex : ArithmeticException => {
        println("ArithmeticException")
      }
      case ex : NullPointerException => {
        println("NullPointerException")
      }
    }finally{
      println("释放资源")
    }
  }
}
