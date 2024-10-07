package datatypes

import javacode.DummyClass
import java.math.BigDecimal

fun main() {

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)

    val longs2 = arrayOf<Long>(1, 2, 3)

    val longs3 = arrayOf(1, 2, 3) // int values

    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    // array of 16 elements
    val evenNumbers = Array(16) {i -> i * 2}

    /*for (number in evenNumbers) {
        println(number)
    }*/

    println(evenNumbers.contentToString())

    val lotsOfNumbers = Array(100000) {i -> i + 1}

    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>

    someArray = arrayOf(1, 2, 3, 4)

    /*for (number in someArray) {
        println(number)
    }*/

    println(someArray.contentToString())

    someArray = Array(6) { i -> (i + 1) * 10 }

    /*for (number in someArray) {
        println(number)
    }*/

    println(someArray.contentToString())

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'A')

    /*for (element in mixedArray) {
        println(element)
    }*/

    println(mixedArray.contentToString())

    println(mixedArray.isArrayOf<Any>())

    val myIntArray = arrayOf(3, 4, 5, 100)

    DummyClass().printNumbers(myIntArray.toIntArray())

    val myIntArray2 = intArrayOf(3, 7, 8, 88)
    DummyClass().printNumbers(myIntArray2)

    var someOtherArray = IntArray(5)

    /*for (number in someOtherArray) {
        println(number)
    }*/

    println(someOtherArray.contentToString())

    DummyClass().printNumbers(evenNumbers.toIntArray())

    val collection = listOf(1, 2, 3)
    val array: Array<Int> = collection.toTypedArray()
    println(array.contentToString())

}