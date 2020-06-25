package com.atguigu.scala.chapter13

import java.io.ObjectOutputStream
import java.net.Socket

/**
  * @Author: lenovo
  * @Time: 2020/6/1 11:46
  * @Description:
  * @Modified By: lenovo
  */
object Driver {
  def main(args: Array[String]): Unit = {
    val executorCount = 5
    val driver = new Socket("localhost",8888)
    val host = driver.getInetAddress.getHostAddress
    val port = driver.getPort
    println(host)
    println(port)
    println("资源中心已经连接")
    val objectOutputStream = new ObjectOutputStream(driver.getOutputStream)
    objectOutputStream.writeObject(Message(s"executorCount=$executorCount&host=$host&port=$port"))
    objectOutputStream.flush()
    driver.close()

  }
}
