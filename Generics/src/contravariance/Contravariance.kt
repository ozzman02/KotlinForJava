package contravariance

fun main() {

    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm pruning a ${flower.name}!")
    }

    val tulipGarden = Garden<Tulip>(listOf(Tulip(), Tulip(), Tulip(), Tulip()), flowerTender)
    tulipGarden.tendFlower(2) // I'm pruning a Tulip!

    /*val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }*/

    //val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), roseTender)

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0) // I'm pruning a rose!

    /*val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil!")
    }*/

    //val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(),Daffodil(), Daffodil()), daffodilTender)
    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(),Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2) // I'm pruning a daffodil!


}

// We also want to pass a FlowerCare of type Flower. Here's where contravariance is needed.
class Garden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {

}

class Rose: Flower("Rose") {

}

class Daffodil: Flower("Daffodil") {

}

class Tulip: Flower("Tulip") {

}

// Contravariant
interface FlowerCare<in T> {
    fun prune(flower: T)
}