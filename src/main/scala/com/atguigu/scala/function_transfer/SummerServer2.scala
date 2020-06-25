package com.atguigu.scala.function_transfer

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.{ServerSocket, Socket}

import com.atguigu.scala.function_transfer.SummerServer1.{envData, start}
import com.atguigu.summer.framework.bean.Task
import com.atguigu.summer.framework.core.Application
import com.atguigu.summer.framework.util.PropertiesUtil

/**
  * @Author: lenovo
  * @Time: 2020/5/24 21:02
  * @Description:
  * @Modified By: lenovo
  */
object SummerServer2 extends Application{
  def main(args: Array[String]): Unit = {
    start("server2"){
      val server = envData.asInstanceOf[ServerSocket]
      println("2号服务器开启！！")
      while(true){
        val client = server.accept()
        new Thread(new Runnable {
          override def run(): Unit = {
            //输入和输出
            // 读对象
            val ois = new ObjectInputStream(client.getInputStream)

            val task = ois.readObject().asInstanceOf[Task]
            println("服务器获得计算逻辑")
            client.shutdownInput()

            // 写对象
            val result = task.compute()
            println("计算结果是" + result)
            task.result = result
            task.data = null
            val clusterArray: Array[String] = PropertiesUtil.getValue("server.cluster").split(" ")
            val address = clusterArray(clusterArray.length-1)
            println(address)
            val reduceServer = new Socket(PropertiesUtil.getValue(address + ".host"),PropertiesUtil.getValue(address + ".port").toInt)
            println(reduceServer)
            val oos = new ObjectOutputStream(reduceServer.getOutputStream)
            oos.writeObject(task)
            oos.flush()
            reduceServer.shutdownOutput()
            reduceServer.close()
            println("当前服务器完成计算")
            client.close()
          }
        }).start()
      }
    }
  }
}
