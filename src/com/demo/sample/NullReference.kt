package com.demo.sample

import com.demo.java.NullReferences

fun main(args: Array<String>) {
    val str: String? = "This is not Null" //Need to explicitly mention the compiler about null

    if(str != null){
        println(str.toUpperCase())
    }

    println("When you run this, you will get  ${str?.toUpperCase()}")

    val str2 = str?: "Default value"
    println("The value of Str2 is $str2")

    val someThing: Any = arrayOf(1, 2, 3, 4)
    val str3 = someThing as? String
    println(str3)

    val str4 = str!!.toUpperCase() // Not Null Assertion

    str?.let { printText(it) } // using let function

    val nullableInts = arrayOfNulls<Int?>(5) // Nullable Array
    for (i in nullableInts){
        println(i)
    }

    println("Output for this is, ${nullableInts[2].toString()}")

    println(NullReferences())
}

fun printText(text:String){
    println(text)
}