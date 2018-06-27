package com.demo.datatype

import com.demo.java.Sample

fun main(args: Array<String>) {
    val myInt = 10
    var myLong = 20L //L is needed for Long Data Type else compiler will treat as Int
    val myLongNumber: Long = 30 // Another way of declaring Long Number
    println("My Int is $myInt and MyLong is $myLong and My Long Number is $myLongNumber")

    myLong = myInt.toLong() //Use the toLong method for widening
    println("Now Long number is $myLong")

    val myDouble = 20.4434
    println(myDouble is Double)
    println("Double is $myDouble")

    val myFloat = 1.234f
    println("Float is $myFloat")
    println(myFloat.toDouble())

    val myChar = 'A'
    println("My Char is $myChar")

    val myCharNumber = 78
    println("Here the Character is ${myCharNumber.toChar()}")

    val myVacation = false
    val onVacation = Sample().isVacation(myVacation)
    println("My Vacation Status is $onVacation")

}