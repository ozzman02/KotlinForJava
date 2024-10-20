@file:JvmName("StaticCar")

package kotlincode

import java.io.IOException
import kotlin.jvm.Throws

fun main() {
    "Print this".print()
    Car.carComp()
}

fun topLevel() = println("I'm in the Car file!")

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {
    println("Printing $str $num")
}

@Throws(IOException::class)
fun doIO() { throw IOException() }

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}

class Car(val color: String, @JvmField val model: String, val year: Int, val isAutomatic: Boolean) {

    companion object {
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in Car's companion object")
    }

    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }

}

fun String.print() {
    println(this)
}



