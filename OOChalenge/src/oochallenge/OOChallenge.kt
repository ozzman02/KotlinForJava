package oochallenge

open class KotlinBicycle(
    var cadence: Int,
    var speed: Int,
    var gear: Int = 10
) {
    fun applyBrake(decrement: Int) { speed -= decrement }
    fun speedUp(increment: Int) { speed += increment }
    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

/* We want var since we want get and set */
class KotlinMountainBike(
    var seatHeight: Int,
    cadence: Int,
    speed: Int,
    gear: Int = 10
) : KotlinBicycle(cadence, speed, gear) {

    // Secondary constructor. Needs to delegate to the primary constructor with this
    constructor(color: String,
                seatHeight: Int,
                cadence: Int,
                speed: Int,
                gear: Int = 20
    ): this(seatHeight, cadence, speed, gear) {
        println("This is the color: $color")
    }

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

/* We want val since there is only a get */
class KotlinRoadBike(
    val tireWidth: Int,
    cadence: Int,
    speed: Int,
    gear: Int = 10
): KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}

fun main() {
    val kotlinBicycle = KotlinBicycle(10, 3, 10)
    kotlinBicycle.printDescription()

    val kotlinMountainBike = KotlinMountainBike(20, 10, 10, 30)
    kotlinMountainBike.printDescription()

    val kotlinRoadBike = KotlinRoadBike(10, 10, 10, 3)
    kotlinRoadBike.printDescription()

    println()
    /********************************************************************************************************/
    val kotlinBicycle2 = KotlinBicycle(10, 3)
    kotlinBicycle2.printDescription()

    val kotlinMountainBike2 = KotlinMountainBike(20, 10, 10)
    kotlinMountainBike2.printDescription()

    val kotlinRoadBike2 = KotlinRoadBike(10, 10, 10)
    kotlinRoadBike2.printDescription()

    println()
    /********************************************************************************************************/
    val kotlinMountainBike3 = KotlinMountainBike("Blue", 10, 10, 10)
    kotlinMountainBike3.printDescription()
    KotlinMountainBike.availableColors.forEach { println(it) }
}