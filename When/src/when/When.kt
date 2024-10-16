package `when`

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {

    val timeOfYear = Season.WINTER

    val str = when (timeOfYear) {
        Season.SPRING -> "Flowers are blooming"
        Season.SUMMER -> "It's hot!"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> "I need a coat"
    }
    println(str)

    val num = 100
    when (num) {
        100, 600 -> println("600")
        in 601..900 -> println("601 - 900")
        300 -> println("300")
        else -> println("Does not match anything");
    }

    val num2 = -50

    when {
        num < num2 -> println("num is less than num2")
        num > num2 -> println("num is greater than num2")
        else -> println("num is equal to num2")
    }

    val y = 10
    when (num) {
        y + 80 -> println("90")
        y + 90 -> println("100")
        else -> println("Does not match anything");
    }

    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj2

    if (something is String) {
        println(something.uppercase())
    } else if (something is BigDecimal) {
        println(something.remainder(BigDecimal(10.5)))
    } else if (something is Int) {
        println("${something - 22}")
    }

    when (something) {
        is String -> println(something.uppercase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println("${something - 22}")
        else -> println("I have no idea what type this is")
    }

    val result = when (something) {
        is String -> {
            println(something.uppercase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {
            println("I have no idea what type this is")
            -1
        }
    }
    println(result)
}