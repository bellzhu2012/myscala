package com.atguigu.scala.function_transfer

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.ServerSocket

import com.atguigu.summer.framework.bean.Task
import com.atguigu.summer.framework.core.Application

/**
  * @Author: lenovo
  * @Time: 2020/5/24 21:02
  * @Description:
  * @Modified By: lenovo
  */
object SummerServer3 extends Application{
  val finalTask = new Task
  def main(args: Array[String]): Unit = {
    start("server3"){
      val server = envData.asInstanceOf[ServerSocket]
      println("3号服务器开启！！")
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
              finalTask.listData.append(task.result)
              finalTask.reduce = task.reduce
              // 写对象

              if(finalTask.listData.size == 2){
                val oos = new ObjectOutputStream(client.getOutputStream)
                val finalResult = finalTask.computeReduce()
                finalTask.result = finalResult
                oos.writeObject(finalResult)
                oos.flush()
                client.shutdownOutput()
                client.close()
                println("当前服务器完成计算")
              }
            }
          }).start()

      }
    }
  }
}
