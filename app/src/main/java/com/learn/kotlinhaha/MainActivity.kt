package com.learn.kotlinhaha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.learn.kotlinhaha.classlearn.MyChildClass
import com.learn.kotlinhaha.classlearn.MyFatherClass
import com.learn.kotlinhaha.classlearn.Student
import java.math.BigDecimal
import java.time.Duration
import java.time.LocalTime

open class MainActivity : AppCompatActivity() ,Impl{
    var maxCount:Int=0

    val tags:String="MainActivity"

    var  view: TextView?=null
    //加了问号之后，一个 Kotlin 变量就像 Java 变量一样没有非空的限制，自由自在了。
    var name:String?=null
    val intArray= intArrayOf(1,2,3)
    init {
        maxCount=100_000

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view=findViewById(R.id.hello_text)
        view?.setText("Hello Kotlin!")



        // 先打印父类的信息 张翠山
        var myFatherClass = MyFatherClass()
        myFatherClass.showPersonDescribe()
        myFatherClass.gestAction()



        // 打印子类的信息 张无忌
        var myChildClass = MyChildClass()
        myChildClass.showPersonDescribe() // 调用此方法 由于子类没有此方法,会去往父类找 找到后调用
        myChildClass.gestAction() // 调用此方法 由于子类没有此方法,会去往父类找 找到后调用

        var stu=Student()

        stu.name="Miracle"
        stu.setAge(23)
        stu.setSex("男")

        Log.e("test",stu.name+"==="+stu.getAge()+"==="+stu.getSex())


        var sample=Sample()
        Log.e("test",sample.w33)

        name?.substring(0,1)

        cook(name)


        LogId(view)


        calculateTime()

        sayHi("kaixue.io")
        sayHi() // 使用了默认值 "world"

        val range=0..100

        for (i in range) {
            println("$i,")
        }

        intArray.forEach {
            println("$it")
        }

        var practiceList= listOf(21,40,11,33,78)

        practiceList.filter {
             it%3==0
        }.forEach {
            println("$it")
        }



    }

    override fun onResume() {
        super.onResume()
    }
    fun sample(name: String){


    }


    fun cook(name: String?){

    }

    /**
     *  override 的不同
        Java 里面 @Override 是注解的形式。
        Kotlin 里的 override 变成了关键字。
        Kotlin 省略了 protected 关键字，也就是说，Kotlin 里的 override 函数的可见性是继承自父类的。
     */
    override fun add(a: Int, b: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun LogId(view: View?){
        Log.e("LogId", (view?.id.toString()))
    }




    fun calculateTime(){
        //Array 方式
        var timeArrayStart=System.currentTimeMillis()
        var array=Array(maxCount){i->(i+1)}

        var totalArray=0
        array.forEach {
            totalArray+=it
        }

        val avgArray = BigDecimal(totalArray).divide(BigDecimal(array.size))
        val durationArray = System.currentTimeMillis()-timeArrayStart
        Log.e(tags, "Array 平均值=$avgArray 用时=$durationArray")

        //IntArray 方式
        var timeIntArrayStart=System.currentTimeMillis()
        var intArray=IntArray(maxCount){i->(i+1)}
        var totalIntArr=0
        intArray.forEach {
            totalIntArr+=it
        }

        val avgIntArr = BigDecimal(totalIntArr).divide(BigDecimal(intArray.size))
        val durationIntArray = System.currentTimeMillis()-timeIntArrayStart
        Log.e(tags, "IntArray 平均值=$avgIntArr 用时=$durationIntArray")



        //List 方式
        var timeListStart = System.currentTimeMillis()
        var list = List(maxCount) { i -> (i + 1) }
        var totalList = 0
        list.forEach {
            totalList += it
        }
        val avgList = BigDecimal(totalList).divide(BigDecimal(list.size))
        val durationList = System.currentTimeMillis()-timeListStart
        Log.e(tags, "List 平均值=$avgList 用时=$durationList")
    }


    fun sayHi(name: String = "world") = println("Hi " + name)
}
