package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 10:45
  * @Description:
  * @Modified By: lenovo
  */
object Scala27_AbstractClass {
  def main(args: Array[String]): Unit = {
    val sub = new SubDept05
    sub.test1()
    sub.test2()

  }
}
abstract class Dept05{
  def test1():Unit
  def test2()={
    println("Dept05...test2...")
  }
}
class SubDept05 extends Dept05{
  def test1(): Unit = {
    println("test")
  }

  override def test2(): Unit = {
    println("sub...test2...")
  }
}
