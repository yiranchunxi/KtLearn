package com.learn.kotlinhaha.classlearn

class PracticeKaixueClass(var name:String){

    var age:Int?=null
    var sex:String?=null
    constructor(name:String,age:Int):this(name){
        this.age=age
    }

    constructor(name:String,age:Int,sex:String):this(name,age){
        this.sex=sex
    }


    fun show(){
        println("name:$name,age:$age,sex:$sex")
    }


}