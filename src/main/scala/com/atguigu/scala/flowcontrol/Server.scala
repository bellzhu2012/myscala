package com.atguigu.scala.flowcontrol

import java.io.ObjectInputStream
import java.net.ServerSocket

/**
  * @Author: lenovo
  * @Time: 2020/5/19 19:56
  * @Description:
  * @Modified By: lenovo
  */
object Server {
  def main(args: Array[String]): Unit = {
    val server :ServerSocket = new ServerSocket(9999)
    println("等待接收数据")
    val client = server.accept()
    val is = client.getInputStream
    val stream = new ObjectInputStream(is)
    val user = stream.readObject()
    println(user)
    stream.close()
    client.close()
    server.close()
  }

}
