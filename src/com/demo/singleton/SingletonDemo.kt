package com.demo.singleton

import java.time.LocalTime

object SingletonDemo {

    fun callMe() = "This is demo for Singleton"

    fun pingMe() = "Hello, you pinged me at ${LocalTime.now()}"
}

fun main(args: Array<String>) {
    println(SingletonDemo.callMe()) //Calling the method with Object name
    println(SingletonDemo.pingMe())
    println(SomeClass.SomeClassCompanion.accessPrivateVar())
    println(SomeClass.accessPrivateVar())
    val someClass1 = SomeClass.justAssign("Hello")
    val someClass2 = SomeClass.upperOrLowerCase("hello", false)
    println(someClass1.someString)
    println(someClass2.someString)

    //Anonymous class implementation
    callSomeInterface(object : SomeInterface {
        override fun mustImplement(num:Int) = "$num returns from mustImplement method"
    })
}

class SomeClass private constructor(val someString:String){
    // Java static Implementation in Kotlin
    companion object SomeClassCompanion{
        private var privateVar = 6
        fun accessPrivateVar() = "I'm access this privateVar which is $privateVar"
        fun justAssign(str:String) = SomeClass(str)
        fun upperOrLowerCase(str:String, lowerCase:Boolean): SomeClass{
            return if(lowerCase) SomeClass(str.toLowerCase())
            else return SomeClass(str.toUpperCase())
        }
    }
}

interface SomeInterface{
    fun mustImplement(num:Int):String
}

fun callSomeInterface(si:SomeInterface){
    println("Calling SomeInterface ${si.mustImplement(22)}")
}