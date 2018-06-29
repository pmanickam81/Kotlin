package com.demo.lambda

fun main(args: Array<String>) {
    run { println("I'm a lambda") }

    val employees = listOf(Employee("Ma", 2017),
            Employee("Pa", 2013),
            Employee("Ko", 1981))

    println(employees.minBy { e -> e.year })

    println(employees.minBy { it.year })

    println(employees.minBy(Employee::year))

    var num = 10

    // Lambda can access local variable. it should be var.
    run {
        num += 10
        println("Num is $num")
    }

    fun printMe() = println("Please print me!")

    run(::printMe) // Method Reference

    println(countTo10())
    println(countTo10with())
    println(countTo10Apply())

}

fun countTo10(): String {
    val numbers = StringBuilder()
    for (i in 1..9) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(10)
    return numbers.toString()
}

fun countTo10with() = with(StringBuilder()) {
    for (i in 1..9) {
        append(i)
        append(", ")
    }
    append(10)
    toString()
}

fun countTo10Apply() = StringBuilder().apply {
    for (i in 1..9) {
        append(i)
        append(", ")
    }
    append(10)
}.toString()

data class Employee(val firstName: String, val year: Int)