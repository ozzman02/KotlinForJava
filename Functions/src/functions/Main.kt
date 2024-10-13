package functions

import utils.Utils

fun main() {
    println(labelMultiply(3, 4, "The result is:"))
    println(labelMultiply(3, 4))
    println(labelMultiply(label = "Here's the result: ", operand2 = 6, operand1 = 3))
    println(whatever())

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)

    printColors(car1, car2, car3)
    printColors2(car1, car2, car3, str = "Color: ")
    printColors3("Color: ", car1, car2, car3)

    val manyCars = arrayOf(car1, car2, car3)

    println(manyCars.contentToString())

    // spread operator * to unpack an array
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()

    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)

    for (c in lotsOfCars) {
        println(c)
    }

    println(Utils().upperFirstAndLast("this is al in lowercase"))

    val s = "this is all in lower case again"
    println(s.upperFirstAndLast())
}

inline fun labelMultiply(operand1: Int,
                  operand2: Int,
                  label: String = "The answer is:"): String = "$label ${operand1 * operand2}"

fun whatever() = 3 * 4

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun printColors2(vararg cars: Car, str: String) {
    for (car in cars) {
        println(car.color)
    }
}

fun printColors3(str: String, vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

/*
    String is the receiver type. This is some sort of illusion since we are associating
    our function with the String class.
*/
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.uppercase()
}

data class Car(val color: String, val model: String, val year: Int) {

}
