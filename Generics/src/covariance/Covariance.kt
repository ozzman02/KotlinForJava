package covariance

fun main() {

    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt(shortList)
}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose: Flower() {

}

class Garden<out T: Flower>(private var something: T) {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]

    //fun plantFlower(flower: T) {}

}