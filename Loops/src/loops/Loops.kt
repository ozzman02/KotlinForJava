package loops

fun main() {
    val range = 1..5

    for (i in range) {
        println(i)
    }

    println()

    val charRange = 'a'..'z'

    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    val r = 5..1
    println(5 in r)
    println(5 in backwardRange)

    val stepRange = 3..15

    println()

    for (n in stepRange) {
        println(n)
    }

    println()

    val stepThree = stepRange.step(3)

    for (n in stepThree) {
        println(n)
    }

    val reverseRange = range.reversed()

    println()

    for (n in reverseRange) {
        println(n)
    }

    println()

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    println()

    for (num in 1..20 step 4) {
        println(num)
    }

    println()

    for (i in 20 downTo 15) {
        println(i)
    }

    println()

    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    println()

    for (i in 1 until 10) {
        println(i)
    }

    println()

    val s = "goodbye"
    val sRange = 0..s.length

}