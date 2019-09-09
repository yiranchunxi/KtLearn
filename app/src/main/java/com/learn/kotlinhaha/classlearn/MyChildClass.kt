package com.learn.kotlinhaha.classlearn

import android.util.Log

class MyChildClass:MyFatherClass {
    init {
        Log.e(" MyChildClass", "init")
    }

    constructor(){
        Log.e(" MyChildClass", "constructor")
    }
    override
    fun gestAction(){
        Log.e("MyFatherClass","自创剑法，剑法厉害......")
    }
}