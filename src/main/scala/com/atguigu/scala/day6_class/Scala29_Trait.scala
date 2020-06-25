package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 11:54
  * @Description:
  * @Modified By: lenovo
  */
object Scala29_Trait {
  def main(args: Array[String]): Unit = {
//    val mySQL = new MySQL
//    mySQL.test()
    val redis1 = new Redis
    redis1.select()
    val redis2 = new Redis with Operate
    redis2.select()
    redis2.insert()
    redis2.update()
  }

}
trait Operate{
//  def test():Unit
  def insert()={
    println("insert...")
  }
  def update()={
    println("update...")
  }
}
//class MySQL extends Operate{
//  def test(): Unit = {
//    println("test")
//  }
//}
class Redis {
  def select()={
    println("select...")
  }
}
