package nullreferences

fun main() {

    // all elements are initialize to null
    val nullableInts = arrayOfNulls<Int?>(5)

    println(nullableInts.contentToString())

    println(nullableInts[3].toString())
}