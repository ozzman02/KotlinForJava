package maps

fun main() {

    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    println(immutableMap.javaClass) // class java.util.LinkedHashMap
    println(immutableMap.map { "${it.key}: ${it.value}" }.joinToString(", "))

    val mutableMap = mutableMapOf<String, Car>(
        "John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012)
    )

    println(mutableMap.javaClass) // class java.util.LinkedHashMap
    println(mutableMap.map { "${it.key}: ${it.value}" }.joinToString(", "))

    val mutableHashMap = hashMapOf<String, Car>(
        "John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012)
    )

    mutableHashMap.put("Mary's car", Car("red", "Corvette", 1965))

    println(mutableHashMap.javaClass) // class java.util.HashMap
    println(mutableHashMap.map { "${it.key}: ${it.value}" }.joinToString(", "))

    /*
        val pair = Pair(10, "ten")
        val firstValue = pair.first
        val secondValue = pair.second

        We can use destructuring declaration like this:

            val pair = Pair(10, "ten")
            val (firstValue, secondValue) = pair // destructuring declaration
            println(firstValue)
            println(secondValue)

        We don't get destructuring out of the box.
        We need component functions

        Destructuring is provided out of the box for data classes
    */

    val pair = Pair(10, "ten")
    //val firstValue = pair.first
    //val secondValue = pair.second
    val (firstValue, secondValue) = pair // destructuring declaration
    println(firstValue)
    println(secondValue)

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("$color - $model - $year")

    // Map Iteration
    for (entry in mutableMap) {
        println("$entry.key - ${entry.value}")
    }

    for ((key, value) in mutableMap) {
        println("$key - $value")
    }

}

/*class Car(val color: String, val model: String, val year: Int) {

    override fun toString(): String {
        return "Car(color='$color', model='$model', year=$year)"
    }

    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year

}*/

data class Car(val color: String, val model: String, val year: Int) {

}