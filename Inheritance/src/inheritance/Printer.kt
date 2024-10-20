package inheritance

fun main() {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()
    println(laserPrinter.bestSellingPrice())

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")

    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")

    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLasePrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {

}

open class Something: MySubInterface {

    val someProperty: String

    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

// data classes can't be extended
data class DataClass(val number: Int) {

}

interface MyInterface {

    val number: Int

    val number2: Int
        get() = number * 100

    fun myFunction(str: String): String

}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}
