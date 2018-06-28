package com.demo.functions

fun main(args: Array<String>) {
    println(multiply(2,3, "The result is:"))
    println(add(2,3, "The result is:"))
    println(sub(5,2)) //with passing default value

    val emp = Employee("mani")
    println(emp.changeCase())

    val car1 = Car("Blue", "Baleno", 2018)
    val car2 = Car("Red", "i10", 2011)
    val car3 = Car("White", "Verna", 2016)

    printColors(car1, car2, car3)

    val manyCars = arrayOf(car1, car2, car3)

    val moreCars = arrayOf(car2, car3)

    val anotherCar = car3.copy()

    val lotOfCars = arrayOf(*manyCars, *moreCars, anotherCar)

    for(c in lotOfCars){
        println(c)
    }

    printColors(*manyCars) // Using spread operator to unpack the array

}

fun multiply(a:Int, b:Int, operation:String):String{
    return("$operation ${a*b}")
}

fun add(a:Int, b:Int, operation:String):String = "$operation ${a+b}"

fun sub(a:Int, b:Int, operation:String = "The answer is:"):String = "$operation ${a-b}"


fun printColors(vararg  cars:Car){
    for(car in cars){
        println("${car.color}, ${car.model}, ${car.year}")
    }
}

data class Car(val color:String, val model:String, val year:Int)

class Employee(private val firstName:String){

    fun changeCase() = firstName.toUpperCase()

}
