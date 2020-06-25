package com.atguigu.scala.WhileLoop

import scala.util.control.Breaks

/**
  * @Author: lenovo
  * @Time: 2020/5/20 13:38
  * @Description:
  * @Modified By: lenovo
  */
object BreakTest {
  def main(args: Array[String]): Unit = {
    Breaks.breakable{
      for(i <- 1 to 5 ){
        if (i == 3){
          Breaks.break()
        }
        println(i)
      }
    }
  }
}
