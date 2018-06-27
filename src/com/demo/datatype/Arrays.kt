package com.demo.datatype

import com.demo.java.Sample
import java.math.BigDecimal

fun main(args: Array<String>) {

    val names = arrayOf("Mcc", "Nee", "Abb")
    println(names is Array<String>)

    val long1 = arrayOf<Long>(1L, 2L, 3L)
    println(long1[0])

    val evenNumbers = Array(16) { i -> i * 2 }
    for (number in evenNumbers)
        println(number)

    val numbers = Array(1000) { i -> i + 1 }

    val zeroArray = Array(5) { i -> 0 }
    for (zero in zeroArray)
        println(zero)

    var someArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (n in someArray)
        println(n)

    someArray = Array(5) { i -> (i + 1) * 10 }
    for (n in someArray)
        println(n)

    val mixedArray = arrayOf("hello", 20, BigDecimal(100.23), 'a')
    for (ma in mixedArray)
        println(ma)
    println(mixedArray is Array<Any>)

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    Sample().printNumbers(intArray)

}

