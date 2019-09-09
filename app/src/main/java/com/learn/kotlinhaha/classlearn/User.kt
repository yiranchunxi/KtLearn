package com.learn.kotlinhaha.classlearn

class User {

    // 初始化代码块，先于下面的构造器执行
    init {

    }

    val id:Int
    val name:String
    constructor(id:Int,name:String){
        this.id=id
        this.name=name
    }

    val final=1
    // 👇 参数是没有 val 的
    fun method(final2:String){
        val final3="The parameter is "+final2
    }



}