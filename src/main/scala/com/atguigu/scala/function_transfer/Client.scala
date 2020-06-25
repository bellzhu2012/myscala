package com.atguigu.scala.function_transfer

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:57
  * @Description:
  * @Modified By: lenovo
  */
object Client {
  def main(args: Array[String]): Unit = {
    val client = new Socket("localhost",9999)
    val os = client.getOutputStream
    val oos = new ObjectOutputStream(os)
    def fun(i : Int)={
      i * 2
    }
    val a = fun _
    oos.writeObject(a)
    println("客户端发送完毕")
    println("客户端等待服务器的计算结果")
    val is = client.getInputStream
    val stream = new ObjectInputStream(is)
    val obj = stream.readObject()
    val num : Int = obj.asInstanceOf[Int]
    println(num)
    println("客户端完成任务，释放资源")
    stream.close()
    oos.close()
  }

}
