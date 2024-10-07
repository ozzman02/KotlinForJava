package datatypes

import javacode.DummyClass

fun main() {

    val myInt = 10

    println("default datatype is ${myInt is Int}")

    var myLong = 22L

    myLong = myInt.toLong();

    val myByte: Byte = 111

    var myShort: Short = myByte.toShort()

    val anotherInt = 5

    var myDouble = 65.986

    println(myDouble is Double)

    val myFloat = 838.849F
    println("this is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'

    val myCharInt = 65

    println(myCharInt.toChar())

    val myBoolean = true

    val myFalseBoolean:Boolean = false

    // Calling a Java class

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    // Any

    val anything: Any
}