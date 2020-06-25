package com.atguigu.scala.function_transfer
import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

import scala.io.Source
import com.atguigu.summer.framework.bean.Task
import com.atguigu.summer.framework.core.Application
import com.atguigu.summer.framework.util.PropertiesUtil

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
/**
  * @Author: lenovo
  * @Time: 2020/5/24 21:02
  * @Description:
  * @Modified By: lenovo
  */
object SummerClient extends Application{
  def main(args: Array[String]): Unit = {
    start("socket"){
      // 获取socket
      for (client <- socketList) {
        // 并行处理
        new Thread(new Runnable {
          override def run(): Unit = {
            // 写对象
            // 过滤数据
            val lines: Iterator[String] = Source.fromFile("input/wordcount.txt").getLines()
            /*
               0 flume hadoop kafka
               1 hello java zookeeper
            * */
            // scala中的类默认已经序列化了
            val oos = new ObjectOutputStream(client.getOutputStream)
            // 切割分区
            val words: ListBuffer[String] = new ListBuffer[String]
            val port = client.getPort()
//            println(port)
            var count = 0
            if(port / 1111 == 8 || port / 1111== 9){
              if(port / 1111 == 8){
                count = 1
              }else {
                count = 0
              }
              while(lines.hasNext){
                val strings: Array[String] = lines.next().split(" ")// ("0","hello","spark")
                //        println(strings.mkString(":"))
                if (strings(0).toInt == count) {
                  words.appendAll(strings.tail)
                }
              }
              //      println(words)
              val task = new Task
              //      task.data = 10
              //      task.logic = (x : Int) => {x * 2}
              task.data = words
              // ListBuffer(hello, scala, hello, spark, flume, hadoop, kafka)
              task.logic = (data)=>{mutable.Map(data.groupBy(word=>word).mapValues(_.size).map(tuple=>tuple).toList.toSeq:_*)}
              task.reduce = (list)=>{
                val head: mutable.Map[String, Int] = list.head
                val last = list.last
                head.foldLeft(last)((map,kv)=>{
                  val key = kv._1
                  val value = kv._2
                  val newValue = map.getOrElse(key,0) + value
                  map(key) = newValue
                  map
                })
              }
              //      println(oos)
              println(task)
              oos.writeObject(task)
              println("客户端已发送逻辑")
              oos.flush()
              client.shutdownOutput()
            }else{
              // 读对象
              val ois = new ObjectInputStream(client.getInputStream)
              val result = ois.readObject().asInstanceOf[Task].result
              println("客户端收到结果是：" + result)
              client.shutdownInput()
            }
          }
        }).start()
      }







    }
  }

}
