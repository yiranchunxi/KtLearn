package com.learn.kotlinhaha

import android.view.View

/**
 * 如果想写工具类的功能，直接创建文件，写 top-level「顶层」函数。
 如果需要继承别的类或者实现接口，就用 object 或 companion object。
 */
fun topLevelFuncion() {
}
class Sample {
    var v: View?=null
    var name:String="Mike"
    var w33="W33 haha"
    val size=18

    companion object{
        val anotherString="Another String"
        /**
         * Kotlin 的常量必须声明在对象（包括伴生对象）或者「top-level 顶层」中，因为常量是静态的。
           Kotlin 新增了修饰常量的 const 关键字。
          Kotlin 中只有基本类型和 String 类型可以声明成常量。
         */
        const val CONST_NUMBER=1
    }


    object  A{
        val number: Int = 1
        fun method() {
            println("A.method()")
        }
    }

    fun main(){
        A.number
        Sample.anotherString
    }
}