package functions.stuff

fun main() {

    val setInts = setOf(10, 15, 19, 5, 3, -22)

    println(setInts.filter { it % 2 != 0 }) // [15, 19, 5, 3]

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    val cars = immutableMap.values

    // {1=Car(color=green, model=Toyota, year=2015), 2=Car(color=red, model=Ford, year=2016), 3=Car(color=silver, model=Honda, year=2013), 8=Car(color=green, model=Ford, year=2010), 17=Car(color=red, model=BMW, year=2015)}
    println(immutableMap.toSortedMap())

    // first item in the list that matches the predicate -> Car(color=green, model=Toyota, year=2015)
    println(cars.find { it.year > 2014 })

    // {green=[Car(color=green, model=Toyota, year=2015), Car(color=green, model=Ford, year=2010)], red=[Car(color=red, model=Ford, year=2016), Car(color=red, model=BMW, year=2015)], silver=[Car(color=silver, model=Honda, year=2013)]}
    println(cars.groupBy { it.color })

    // [Car(color=green, model=Ford, year=2010), Car(color=silver, model=Honda, year=2013), Car(color=green, model=Toyota, year=2015), Car(color=red, model=BMW, year=2015), Car(color=red, model=Ford, year=2016)]
    println(cars.sortedBy { it.year })

    println(immutableMap.all { it.value.year > 2014 }) // false

    println(immutableMap.any { it.value.year > 2014 }) // true

    println(immutableMap.count { it.value.year > 2014 }) // 3

    println(immutableMap.filter { it.value.model == "Ford" }
        .map { it.value.color }) // [red, green]

    println(immutableMap.map { it.value.year }) // [2015, 2016, 2013]

    println(immutableMap.filter { it.value.year == 2016 }) // {2=Car(color=red, model=Ford, year=2016)}

    val mutableMap = mutableMapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    mutableMap.filter { it.value.color == "silver" } // needs to return another instance
    println("The filters map is $mutableMap") // no filter applied

    println()

    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List) // [11, 12, 13, 14, 15]
    println(add10List.javaClass)

    println()

    val ints2 = arrayOf(1, 2, 3, 4, 5)
    val add10List2 = ints2.map { it + 10 }
    println(add10List2) // [11, 12, 13, 14, 15]
    println(add10List2.javaClass)

}

data class Car(val color: String, val model: String, val year: Int) {

}