package com.learn.kotlinhaha.classlearn

class Student:Person(){

    /**
     * name用private私有修饰，外界其他地方不准访问，隐藏细节
     * name提供set get 方法 对外暴露功能
     * 对细节隐藏，只暴露自定义暴露的东东，就是属于封装的体现
     */
    private  var name:String=""

    fun  getName():String{
        return name
    }

    fun setName(name: String){
        this.name=name
    }

    private var age:Int=0

    fun getAge():Int{
        return age
    }


    fun setAge(value:Int){
        if(value<0||value>150){
            return
        }
        age=value
    }

    private var sex:String=""

    fun getSex():String{
        return sex
    }


    fun setSex(sex:String){
        if("男".equals(sex)||"女".equals(sex)){
            this.sex=sex
            return
        }
    }


    override var personName: String
        get() = super.personName
        set(value) {
            personName=value
        }




}

