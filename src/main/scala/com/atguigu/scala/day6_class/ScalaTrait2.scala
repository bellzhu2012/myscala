package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 21:45
  * @Description:
  * @Modified By: lenovo
  */
object ScalaTrait2 {
  def main(args: Array[String]): Unit = {
    val sql = new MySQL
    sql.operate()
  }
}
trait Operator2{
  println("operator2.。。")
  def operate()={
    println("操作数据。。。")
  }
}
trait DB2 extends Operator2{
  println("DB2...")
  override def operate(): Unit = {
    print("向数据库中。。。")
    super.operate()
  }
}
trait Log2 extends Operator2{
  println("log。。。")
  override def operate(): Unit = {
    print("向日志中。。。")
    super.operate()
  }
}
class MySQL extends DB2 with Log2{
  println("mysql")
}
