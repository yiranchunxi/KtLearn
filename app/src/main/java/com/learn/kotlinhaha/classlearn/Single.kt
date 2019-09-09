package com.learn.kotlinhaha.classlearn

class Single private constructor(){

    companion object{
        fun newInsatance():Single{
            return Single()
        }

    }


    fun  main(){
        var single=Single.newInsatance()
    }
}