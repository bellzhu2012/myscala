package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/30 8:17
  * @Description:
  * @Modified By: lenovo
  */
object Scala33_Collection_Test {
  def main(args: Array[String]): Unit = {
    // TODO 不同省份(当中)商品点击排行
    // (item count) => (word, count)
    val dataList = List(
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "电脑"),
      ("zhangsan", "河南", "电脑"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子")
    )
    // 数据清洗
    // ("wangwu", "河北", "帽子") => ("河北", "帽子") => ("河北-帽子")
    val list: List[String] = dataList.map(
      (tuple) => {
        (tuple._2 + "-" + tuple._3)
      })
    // 分组
    // group ("河北-帽子") => ("河北-帽子", List("河北-帽子"))
    val dataToListMap: Map[String, List[String]] = list.groupBy(s=>s)
    // 统计  ("河北-帽子", List("河北-帽子")) =>("河北-帽子", count)
    val dataToCountMap: Map[String, Int] = dataToListMap.mapValues(_.size)
    // 重组  ("河北-衣服", count) => ( 河北, (衣服，count) )
    val prvToItemAndCountList = dataToCountMap.toList.map(
      tuple => {
        val words: Array[String] = tuple._1.split("-")
        (words(0), (words(1),tuple._2))
      })
    // ( 河北, List[(帽子，count),(鞋，count),(衣服，count) ])
    val groupMap = prvToItemAndCountList.groupBy(_._1)
    //  ( 河北, (河北, List[(帽子，count),(鞋，count),(衣服，count) ]))
    val result = groupMap.mapValues(
      v => {
        val list = v.map(_._2)
        list.sortWith(
          (left, right) => {
            left._2 > right._2
          }
        )
      })
   println(result)
  }
}
