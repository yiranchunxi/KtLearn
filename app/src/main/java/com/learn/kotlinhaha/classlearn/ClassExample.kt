package com.learn.kotlinhaha.classlearn

/**
 * kotlin class 类 构造器
 */
class ClassExample (val name:String,val id:String){

    init {

    }

    constructor(person: Person):this(person.name,person.id)
}