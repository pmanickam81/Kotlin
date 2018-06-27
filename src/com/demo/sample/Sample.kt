package com.demo.sample

fun main(args: Array<String>) {
    val str = "Welcome to Kotlin"
    println("Hello World, $str")
    println("Sample function Expression = ${sum(10, 20)}")
}

// Sample Function Expression
fun sum(a:Int, b:Int) = a+b