package functions

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter", "summer")
    val colorList = listOf("black", "white", "red", "red")

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("other season")
    println(mutableSeasons)

    println(strings.last())

    println(strings.reversed())

    println(strings.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)

    println(ints.max())

    // Zip create pair elements, Pair is a class
    println(colorList.zip(strings)) // [(black, spring), (white, summer), (red, fall)]

    val mergedLists = listOf(colorList, strings)
    println(mergedLists) // [[black, white, red], [spring, summer, fall, winter]]

    val combinedList = colorList + strings
    println(combinedList) // [black, white, red, spring, summer, fall, winter]

    val noDuplicatesList = colorList.union(strings)
    println(noDuplicatesList) // [black, white, red, spring, summer, fall, winter]

    val noDuplicateColors = colorList.distinct()
    println(noDuplicateColors) // [black, white, red]
}