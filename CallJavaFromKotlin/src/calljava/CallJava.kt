package calljava

import javacode.Car

fun main() {

    val car = Car("blue", "Ford", 2015)

    car.color = "green" // using setter

    println(car)

    car.variableMethod(5, "hello", "goodbye")

    val strings = arrayOf("hello", "goodbye")

    car.variableMethod(10, *strings)

    car.wantsIntArray(arrayOf(1, 2, 3).toIntArray())
    car.wantsIntArray(intArrayOf(1, 2, 3))

    // (car.anObject as java.lang.Object).notify()
    // car.anObject.javaClass

    println("x = ${Car.x}")
    println(Car.xString())

    car.demoMethod { println("I'm in a thread!") }

}