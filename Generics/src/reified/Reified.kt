package reified

import java.math.BigDecimal

fun main() {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-5938.393849))

    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)

    for (item in bigDecimalsOnly) {
        println(item)
    }

}

// Reification is a Kotlin feature that prevents the type from being erased at runtime.
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}