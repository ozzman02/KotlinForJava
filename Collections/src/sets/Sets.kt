package sets

fun main() {

    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10)) // not added
    println(setInts.minus(19))
    println(setInts.minus(100)) // nothing happens
    println(setInts.average())
    println(setInts.drop(3)) // drop first 3 elements -> [5, 3, -22]

    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    mutableInts.plus(10) // not added
    println(mutableInts) // [1, 2, 3, 4, 5]

}