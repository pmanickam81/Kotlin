package com.demo.`interface`

open class MyClass:MySubInterface {

    override val myNumber: Int = 36

    override fun myFunction(str: String): String {
        return "Hello $str, This is from myFunction Interface method and the Number is $myNumber"
    }

    override fun mySubFunction(str: String): String {
        return "Hello $str, This is from mySubFunction Interface method and the Number is $myNumber"
    }
}

open class MyDemoClass():MyClass(), MyInterface{

    fun demoFunction(str:String):String = "Hello $str, This is from Demo Class and the Number is $mySecondNumber"

}

fun main(args: Array<String>) {
    val demoClass = MyDemoClass()
    println(demoClass.demoFunction("Mani"))
    println(demoClass.myFunction("Manickam"))
    println(demoClass.mySubFunction("Me"))
}