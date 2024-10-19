package sequences


fun main() {

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    println(immutableMap.filter { it.value.model == "Ford" }
        .map { it.value.color })

    println(immutableMap.asSequence()
        .filter { it.value.model == "Ford" }
        .map { it.value.color })

    // toList is a terminal operation
    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' } // each item is evaluated
        .map { println("mapping $it"); it.uppercase() }
        .toList()

    println()

    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith("E") }

    println()

    listOf("Joe", "Mary", "Jane")
        .map { println("mapping $it"); it.uppercase() }
        .filter { println("filtering $it"); it[0] == 'J' }
        .find { it.endsWith("E") }

    println()

    listOf("Mary", "Jane", "Joe").asSequence()
        .map { println("mapping $it"); it.uppercase() }
        .filter { println("filtering $it"); it[0] == 'J' }
        .find { it.endsWith("E") }

}

data class Car(val color: String, val model: String, val year: Int) {

}