package com.learn.kotlinhaha.classlearn

class Variables {
  /*  满足如下之一就不装箱：

    不可空类型。
    使用 IntArray、FloatArray 等。*/
    var number: Int = 1

    var c: Char = 'a'

    var b: Boolean =true

    var array:IntArray= intArrayOf(1,2,3)


    var str:String="string"

    val name:String="world"
    val myName = "kotlin"

    val text = """
        Hi $name!
      My name is $myName.\n
    """.trimMargin()
    fun  main(){
      println("Hi ${name.length}")
    }
}