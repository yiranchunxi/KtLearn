package com.learn.kotlinhaha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.learn.kotlinhaha.classlearn.MyChildClass
import com.learn.kotlinhaha.classlearn.MyFatherClass
import com.learn.kotlinhaha.classlearn.Student

class MainActivity : AppCompatActivity() {
    lateinit var  view: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view=findViewById(R.id.hello_text)
        view.setText("Hello Kotlin!")



        // 先打印父类的信息 张翠山
        var myFatherClass = MyFatherClass()
        myFatherClass.showPersonDescribe()
        myFatherClass.gestAction()



        // 打印子类的信息 张无忌
        var myChildClass = MyChildClass()
        myChildClass.showPersonDescribe() // 调用此方法 由于子类没有此方法,会去往父类找 找到后调用
        myChildClass.gestAction() // 调用此方法 由于子类没有此方法,会去往父类找 找到后调用

        var stu=Student()

        stu.setName("Miracle")
        stu.setAge(23)
        stu.setSex("男")

        Log.e("test",stu.getName()+"==="+stu.getAge()+"==="+stu.getSex())


        var sample=Sample()
        Log.e("test",sample.w33)
    }

    override fun onResume() {
        super.onResume()
    }
    fun sample(name: String){


    }
}
