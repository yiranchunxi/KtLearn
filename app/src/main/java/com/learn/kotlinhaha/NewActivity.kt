package com.learn.kotlinhaha

import android.app.Activity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class NewActivity:MainActivity() {

    fun action(){}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var activity:Activity=NewActivity()

        if(activity is NewActivity){
            activity.action()
        }

        (activity as NewActivity).action()

        // 👇'(activity as? NewActivity)' 之后是一个可空类型的对象，所以，需要使用 '?.' 来调用
        (activity as? NewActivity)?.action()

        /**
         * 和 Java 创建匿名类的方式很相似，只不过把 new 换成了 object:：
            Java 中 new 用来创建一个匿名类的对象
            Kotlin 中 object: 也可以用来创建匿名类的对象
            这里的 new 和 object: 修饰的都是接口或者抽象类。
         */

        val listener=object :ViewPager.SimpleOnPageChangeListener(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        }
    }

    override fun add(a: Int, b: Int) {
        super.add(a, b)
    }

    /**
     *  activity as? NewActivity
        activity as NewActivity?
        activity as? NewActivity?
     *  - 如果 activity 是NewActivity 类型，就转换成功，否则返回空
        - 如果 activity 是NewActivity 类型，就转换成功，如果activity= null，则返回空；否则抛出 java.lang.ClassCastException 异常
        - 如果 activity 是NewActivity 类型，就转换成功，否则返回空（和第一种一样）

     */
}