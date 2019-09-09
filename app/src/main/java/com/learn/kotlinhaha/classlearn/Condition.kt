package com.learn.kotlinhaha.classlearn

import java.lang.Integer.parseInt

/**
 * 条件控制
 */
class Condition {

    val a:Int=1
    val b:Int=2
    val str: String? = "Hello"
    //Elvis 操作符  ?:
    val length: Int = str?.length ?: -1
    fun main(){

        val max=if(a>b) a else b

        when(a){
            1-> {
                println("1")}
            2-> {
                println("1")}

            else -> { println("else") }
        }

        when (b) {

                1, 2 -> print("x == 1 or x == 2")
                else -> print("else")
        }
        val a: Int? = try { parseInt("2") } catch (e: NumberFormatException) { null }

        /**
         *  Kotlin 中也有两种相等比较方式：
         *  == ：可以对基本数据类型以及 String 等类型进行内容比较，相当于 Java 中的 equals
            === ：对引用的内存地址进行比较，相当于 Java 中的 ==
         */

    }

    fun validate(user: User) {
        val id = user.id ?: return // 👈 验证 user.id 是否为空，为空时 return
    }
}