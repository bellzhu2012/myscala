package com.atguigu.scala.chapter09

/**
  * @Author: lenovo
  * @Time: 2020/5/31 9:32
  * @Description:
  * @Modified By: lenovo
  */
object Scala02_Exception1 {
  def main(args: Array[String]): Unit = {
    val dept = new Dept
    dept.test()
  }
}
class Dept{
  @throws[Exception]
  def test()={
    throw new Exception
  }
}
