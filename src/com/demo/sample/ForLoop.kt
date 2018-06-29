package com.demo.sample

fun main(args: Array<String>) {

    val range = 1..5

    val backwardRange = 5.downTo(3)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val stepFive = stepRange.step(5)

    val reverseRange = range.reversed()

    println(3 in range)
    println(3 in backwardRange)
    println(stepThree)
    println(stepFive)
    println(reverseRange)

    for(i in range)
        println("Range is $i")

    for(i in stepFive)
        println("Step Five is $i")

    for(n in 1..20 step 4)
        println(n)

    for(i in 100 downTo 10 step 10)
        println(i)

    for(i in 1 until 10)
        println(i)

    val seasons = arrayOf("Summer", "Winter", "Spring")
    for(season in seasons)
        println(season)

    val notASeason = "whatever" !in seasons
    println(notASeason)

    println(32 !in 1..40)

    for(index in seasons.indices)
        println("Seasons index is $index")

    seasons.forEach { println(it) }

    seasons.forEachIndexed { index, value -> println("$index is $value ") }


}

