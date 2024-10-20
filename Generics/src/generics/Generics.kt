package generics

import java.math.BigDecimal

fun main() {

    val list: MutableList<String> = mutableListOf("Hello")

    list.add("another string")

    printCollection(list)
    list.displayCollection()

    println()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))

    printCollection(bdList)
    bdList.displayCollection()

    println()

}

fun <T> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

// Extension Function on List
fun <T> List<T>.displayCollection() {
    for (item in this) {
        println(item)
    }
}