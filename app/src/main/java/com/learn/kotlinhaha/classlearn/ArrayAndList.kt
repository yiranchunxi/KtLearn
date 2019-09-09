package com.learn.kotlinhaha.classlearn

/**
 * 数组和集合
 */
class ArrayAndList {
    val strs: Array<String> = arrayOf("a","b","c")


    val intArray= intArrayOf(1,2,3)

    /**
     * List 以固定顺序存储一组元素，元素可以重复。
       Set 存储一组互不相等的元素，通常没有固定顺序。
       Map 存储 键-值 对的数据集合，键互不相等，但不同的键可以对应相同的值。
     */
    //List
   val strList= listOf("a","b","c")

   val strList2:List<String> = listOf("a","b","c")

   val anys:List<Any> = strList2

    //Set
    val strSet = setOf("a","b","c")


    //Map
    val map = mapOf("key1" to 1 ,"key2" to 2 , "key3" to 3 ,"key4" to 4)

    /**
     * ，因为只有 mutableMapOf() 创建的 Map 才可以修改。Kotlin 中集合分为两种类型：只读的和可变的。这里的只读有两层意思：

        集合的 size 不可变
        集合中的元素值不可变

        listOf() 创建不可变的 List，mutableListOf() 创建可变的 List。
        setOf() 创建不可变的 Set，mutableSetOf() 创建可变的 Set。
        mapOf() 创建不可变的 Map，mutableMapOf() 创建可变的 Map。
       mutable 前缀的函数创建的是可变的集合，没有 mutbale 前缀的创建的是不可变的集合，不过不可变的可以通过  toMutable*() 系函数转换成可变的集合：
     */
    val listVar = mutableListOf(1,2,3)
    val mapVar= mutableMapOf("key1" to 1 ,"key2" to 2)
    val setVar= mutableSetOf(1,2,3)


    //Range

    val range:IntRange=0..1000
    //这里的 0 until 1000 表示从 0 到 1000，但不包括 1000，这就是半开区间 [0, 1000) 。
    val range1: IntRange = 0 until 1000


    //Sequence
    val sequence= sequenceOf(1,2,3,4)

    val result: Sequence<Int> = sequence
        .map { i ->
            println("Map $i")
            i * 2
        }
        .filter { i ->
            println("Filter $i")
            i % 3  == 0
        }

    fun main(){
        map.toMutableMap()

        intArray.forEach { i ->
            print("$i, ")
        }
        intArray.forEach {
            it != 1
        }
        val newList: List<Int> = intArray.filter { i ->
            i != 1 // 👈 过滤掉数组中等于 1 的元素
        }

        val newList1:List<Int> =intArray.map {i->
            i+1
        }
        //          [1, 2, 3]

        // {"2", "a" , "3", "a", "4", "a"}

        intArray.flatMap { i->
            listOf("${i+1}","a")
        }


        for (i in range) {
            print("$i, ")
        }

        for (i in range step 2) {
            print("$i, ")
        }

        for (i in 4 downTo 1) {
            print("$i, ")
        }


    }



    fun<T> fill(array: Array<in T>,t:T){
        array[0]=t
    }

    fun <T> copy(srcArray:Array<out T>,dstArray:Array<in T>){
        for(i in  srcArray.indices){
            dstArray[i]=srcArray[i]
        }
    }

}