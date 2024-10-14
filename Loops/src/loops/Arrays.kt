package loops

fun main() {
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) {
        println(season)
    }

    println()

    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    println()

    seasons.forEach { println(it) }

    println()

    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    println()

    val notASeason = "whatever" !in seasons
    println(notASeason)

    println()

    val notInRange = 32 !in 1..10
    println(notInRange)

    println()

    val str = "Hello"
    println('e' in str)
    println('e' !in str)

    println()

    for (i in 1..3) {
        println("i = $i")
        jLoop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    break@jLoop // we can use continue
                }
            }
        }
    }
}