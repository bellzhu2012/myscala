package com.atguigu.scala.flowcontrol

import java.io.ObjectOutputStream
import java.net.Socket

/**
  * @Author: lenovo
  * @Time: 2020/5/19 19:56
  * @Description:
  * @Modified By: lenovo
  */
object Client {
  def main(args: Array[String]): Unit = {
    val socket = new Socket("localhost",9999)
    val os = socket.getOutputStream
    val stream = new ObjectOutputStream(os)
    val user = new User
    stream.writeObject(user)
    println("数据已发送！")
    stream.close()
    socket.close()
  }

}
