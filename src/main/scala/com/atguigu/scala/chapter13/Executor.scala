package com.atguigu.scala.chapter13

/**
  * @Author: lenovo
  * @Time: 2020/6/1 11:50
  * @Description:
  * @Modified By: lenovo
  */
case class Executor(id : Int, host:String, port:Int) {
  def startUp()={
    println(id + "号执行器开始启动")
    println(s"host:$host,port:$port")

  }
}
