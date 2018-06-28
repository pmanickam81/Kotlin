package com.demo.inheritance

abstract class Printer(val modelName:String) {

    open fun printModel() = println("The model name is $modelName")

    abstract fun sellingPrice(): Double // abstract function is open by default

}

open class LaserPrinter(modelName: String):Printer(modelName){

    override fun printModel() = println("This $modelName is laser printer")

    final override fun sellingPrice(): Double = 130.33 // can not be overridden by sub class
}

class SpecialLaserPrinter(modelName: String, ppm:Int): LaserPrinter(modelName){

    fun specialPrintModel(ppm:Int):String {
        return "The model is $modelName and the PPM is $ppm"
    }

}

open class Something{
    val someProperty: String

    constructor(someParameter:String){
        someProperty = someParameter
        println("I'm in Parent constructor")
    }
}

class SomethingElse:Something{
    constructor(someOtherParameter:String): super(someOtherParameter){
        println("I'm in Child Constructor")
    }

}

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Hello Model").printModel()
    println(LaserPrinter("").sellingPrice())

    val specialPrinter = SpecialLaserPrinter("New", 123)
    println(specialPrinter.specialPrintModel(123))

    val somethingElse = SomethingElse("Hi")
}