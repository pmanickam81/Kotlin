package com.demo.`interface`

interface MyInterface {
    fun myFunction(str:String):String
}


interface MySubInterface:MyInterface{
    val myNumber:Int
    val mySecondNumber: Int
        get() = myNumber * 10
    fun mySubFunction(str:String):String
}