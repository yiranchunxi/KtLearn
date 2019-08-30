package com.learn.kotlinhaha.classlearn

import android.util.Log

/**
 * 描述父对象：张翠山
 *
 * personDescribe 此人的简介 /  var personDescribe:String 此String是Kotlin的
 *
 * 描述行为：gestAction 武功
 */
// 注意：⚠️ 必须此类默认是不被其他类继承的，如果想被其他类继承 需要加入 open 修饰
open class MyFatherClass {

    /**
     * final 不能被重写  类中成员默认使用
     * open  可以被重写  需要明确地表明
     * abstract 必须被重写  只能在抽象类中使用;抽象成员
     * private 类中可见    文件中可见
     */


    // 注意：⚠️ 必须此成员变量默认是不被其他类使用的，如果想被其他类使用 需要加入 open 修饰
    open var personDescribe:String="义薄云天，大仁大义 ....";

    /**
     * 显示个人简介
     */
    // 注意：⚠️ 必须此方法默认是不被其他类使用的，如果想被其他类使用 需要加入 open 修饰
    fun showPersonDescribe(){
        Log.e("MyFatherClass","张翠山-Father简介${personDescribe}")
    }

    /**
     * 张翠山的武功
     */
    // 子类继承加open 和override才能重写方法
    open fun gestAction(){
        Log.e("MyFatherClass","自创剑法，剑法厉害......")
    }

}