package com.learn.kotlinhaha.classlearn

import android.util.Log

class MyChildClass:MyFatherClass() {

    override
    fun gestAction(){
        Log.e("MyFatherClass","自创剑法，剑法厉害......")
    }
}