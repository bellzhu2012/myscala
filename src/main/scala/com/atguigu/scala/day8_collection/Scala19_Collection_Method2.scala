package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/28 10:19
  * @Description:
  * @Modified By: lenovo
  */
object Scala19_Collection_Method2 {
  def main(args: Array[String]): Unit = {
    // 映射
//    val list: List[Int] = List(1,2,3,4,5)
//    def fun(i: Int) = {
//      i * 2
//    }
    // map方法可以将集合通过制定的转换规则变为新的集合
//    val newList: List[Int] = list.map(fun)
//    println(newList)
//    println(list.map((i:Int)=>{i *2}))
//    println(list.map((i:Int)=>i *2))
//    println(list.map(i=> i *2))
//    println(list.map(_ * 2))
    // flatten:扁平化
    // 所谓扁平化，其实就是将整个拆分成为一个一个的个体
    // 扁平化只对外层数据起作用
    // 1::list:::Nil
//    val list1 = List(List(List(1,2)), List(List(3,4)))
//    println(list1.length)
//    println(list1.flatten)
//    println(list1.flatten.flatten)
//    println(list1.flatten.flatten.map(_ *2))
    // flatMap:先flatten，然后再map
    // flatMa参数中的匿名函数就是map的匿名函数，参数是flatten之后的结果(list),map的逻辑就是对list进行map
//    println(list1.flatten.flatMap(_.map(_*2)))
//    val list = List(
//      List(1,2),List(3,4)
//    )
//    println(list.flatten.map(_*2))
//
//    def fun(list : List[Int])={
//      println(list +"----")
//      val newList = list.map(_*2)
//      println(newList + "++++")
//      newList
//    }
//    println(list.flatMap(fun))
//    println(list.flatMap((list:List[Int])=>{list.map(_*2)}))
//    println(list.flatMap((list:List[Int])=>list.map(_*2)))
//    println(list.flatMap(list=>list.map(_*2)))
//    println(list.flatMap(_.map(_*2)))
//    val list = List("hello scala", "hello spark")
////    println(list.flatten)
//    def fun(str : String)={
//      str.split(" ")
//    }
//
//    println(list.flatMap(fun)) // 先map，然后再flatten
    /**
    ("hello scala", "hello spark")
    => (List("hello","scala", List("hello","spark"))
    =>("hello", "scala", "hello", "spark")
      */

//    val list = List(1,2,3,4)
    //    println(list.flatMap((num : Int)=>{List(num *2)}))
    // 过滤
    // 按照指定的规则对集合中的每一条数据进行筛选过滤
    // 满足要求的留下
//    val list = List(1,2,3,4)
//    def fun(i: Int)={
//      i % 2 == 0
//    }
//    println(list.filter(fun))
//    val list = List("hello", "scala", "hello", "spark")
//    def fun(s:String)={
//      s.startsWith("s")
//    }
//
//    println(list.filter(fun))
    // 分组
    // 按照指定的规则对集合中的每一个数据进行分组
    // 匿名函数返回值作为key，对应的List作为value
//    val list = List(1,2,3,4)
//    def fun(i: Int)={
//      i % 2
//    }
//
//    val map: Map[Int, List[Int]] = list.groupBy(fun)
//    println(map)
//    val list = List("hello", "scala", "hello", "spark")
    //    def fun(s : String)={
    //      s.startsWith("s")
    //    }
    //
    //    println(list.groupBy(fun))
    // 排序
    // 将集合中的每一个元素按照指定的规则进行排序
    // 默认为升序
    // sortBy可以使用函数科里化实现降序
//    val list = List(3,1,4,2)
//    println(list.sortBy(n=>n))
//    println(list.sortBy(n => -n))
//    println(list.sortBy(num => num)(Ordering.Int.reverse))
    // 字符串排序按照字典序
//    val list = List("hello", "scala", "hello", "spark")
//    println(list.sortBy(num => num))
    val user1 = new User
    user1.name = "zhangsan"
    user1.age = 22

    val user2 = new User
    user2.name = "list"
    user2.age = 30

    val user3 = new User
    user3.name = "liuda"
    user3.age = 10
    val users = List(user1, user2, user3)
    println(users.sortBy(user=>{
      (user.age, user.name)
    }))



  }
  class User{
    var name : String = _
    var age : Int = _

    override def toString: String = {
      s"User[$name, $age]"
    }
  }
}
