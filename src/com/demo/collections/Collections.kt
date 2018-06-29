package com.demo.collections

fun main(args: Array<String>) {
    val strings = listOf("A", "B", "C", "D")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("Hello", "Hi", null, "Hey")
    println(notNullList)

    val mutableList = mutableListOf<Int>(1,2,3,4,5)
    println("${mutableList.javaClass}, $mutableList")

    val array = arrayOf("A", "B", "C", "D", "E")
    val arrayList = array.toList() //arrayListOf(*array)
    println(arrayList)

    println("Last element of the list is ${arrayList.last()}")

    println("Reversing the List is ${arrayList.asReversed()}, ${arrayList.reversed()}")

    println("${arrayList.getOrNull(5)}, ${arrayList.getOrNull(4)}")

    val list1 = listOf<Int>(1,2,3,4,5,3,5,4)
    val list2 = listOf<Int>(6,7,8,9,10,11,3,5)
    val list3 = list1.zip(list2) //It will create tuples and ignore the single element
    println(list3)
    val list4 = listOf(list1, list2)
    println(list4)
    val list5 = list1 + list2
    println(list5)
    val list6 = list1.union(list2) // removes duplicates
    println(list6)
    val list7 = list1.distinct()
    println(list7)
    val mutableNumList = list1.toMutableList()
    mutableNumList.add(8)
    println(mutableNumList)

}