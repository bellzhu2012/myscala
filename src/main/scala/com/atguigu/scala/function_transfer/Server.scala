package com.atguigu.scala.function_transfer

import java.io.{ObjectInput, ObjectInputStream, ObjectOutputStream}
import java.net.ServerSocket

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:58
  * @Description:
  * @Modified By: lenovo
  */
object Server {
  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(9999)
    println("服务器等待计算方法")
    val socket = server.accept()
    val is = socket.getInputStream
    val ois = new ObjectInputStream(is)
    val obj = ois.readObject()
    val function = obj.asInstanceOf[Int =>Int]
    println(function)
    val num = function(2)
    println(num)
    val os = socket.getOutputStream
    val oos = new ObjectOutputStream(os)
    oos.writeObject(num)
    println("服务器完成计算")
    oos.close()
    ois.close()
  }
}
