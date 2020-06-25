package com.atguigu.scala.chapter13

import java.io.ObjectInputStream
import java.net.ServerSocket

/**
  * @Author: lenovo
  * @Time: 2020/6/1 11:46
  * @Description:
  * @Modified By: lenovo
  */
object ResourceCenter {
  def main(args: Array[String]): Unit = {
    val resouceCenter = new ServerSocket(8888)
    println("资源中心启动")
    while(true){
        val driver = resouceCenter.accept()
        println(driver)
        new Thread(new Runnable {
          override def run(): Unit = {
            val objectInputStream = new ObjectInputStream(driver.getInputStream)
            val message = objectInputStream.readObject().asInstanceOf[Message]
            val strings = message.content.split("=|&")
            val count = strings(1).toInt
            val host = strings(3)
            val port = strings(5).toInt
            println(count)
            for( i <- 1 to count){
                val executor = new Executor(i,host,port)
                executor.startUp
            }
          }
        }).start()
    }
  }
}
