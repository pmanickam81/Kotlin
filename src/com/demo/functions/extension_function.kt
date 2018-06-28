package com.demo.functions

fun main(args: Array<String>) {
    println("the value is".upperFirstAndLast())
}

fun String.upperFirstAndLast():String{
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1)+
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

