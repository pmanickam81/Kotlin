package com.demo

fun main(args: Array<String>) {
    val str:String ="Welcome to Kotlin"
    println("Hello World, $str")
    println("Sample function Expression = ${sum(10,20)}")
}

fun sum(a:Int, b:Int) = a+b