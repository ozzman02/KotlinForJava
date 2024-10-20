package walkfiletree

import java.io.File

fun main() {
    File(".").walkTopDown().forEach { println(it) }

    println()

    File(".").walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }

}