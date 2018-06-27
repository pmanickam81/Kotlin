package com.demo.modifiers

fun main(args: Array<String>) {

    val e1 = Employee("M")
    println(e1.firstName)
    println(e1.fullTime)

    val e2 = Employee("P", false)
    println(e2.firstName)
    println(e2.fullTime)

    val e3 = Employee3("P", false)
    println(e3.firstName)
    println(e3.fullTime)

    val e4 = Employee3("P")
    println(e4.firstName)
    println(e4.fullTime)

    val emp2 = Employee2("P")
    println(emp2.firstName)

    println(Demo().dummy)

    val e5 = Employee("H")
    e5.fullTime = false
    println("first name is ${e5.firstName} and full time is ${e5.fullTime}")

    val e6 = Employee4("Hello")
    e6.fullTime = false
    println("first name of Employee4 is ${e6.firstName} and full time of Employee4 is ${e6.fullTime}")

    val e7 = Employee5("Manickam")
    e7.fullTime = true
    println("Here ${e7.firstName} and ${e7.fullTime}")
}


// Without having explicit keyword constructor
class Employee2 constructor (val firstName: String)


// Setting default value
class Employee(val firstName: String){

    var fullTime = true

    //secondary constructor
    constructor(firstName: String, fullTime:Boolean):this(firstName){
        this.fullTime = fullTime
    }
}

// Class with default value
class Employee3 constructor(val firstName: String, var fullTime: Boolean = true)


// NO need to have the constructor key word
class Employee4 (val firstName: String, var fullTime: Boolean = true)


// Class with custom getter and setter methods
class Employee5 (val firstName:String, fullTime:Boolean=true){

    var fullTime = fullTime

    get(){
        println("Calling custom get")
        return field
    }

    set(value){
        println("Calling custom set")
        field = value
    }
}

class Demo{

    val dummy: String = "Hello"

    /*val dummy: String

    constructor(){
        dummy = "Hello"
    }*/

}