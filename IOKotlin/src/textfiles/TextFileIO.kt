package textfiles

import java.io.File

fun main() {

    /* Reads entire file. The use function closes the resource in this case, the reader. */
    val lines = File("testfile.txt").reader().use { it.readText() }
    println(lines)

    val lines2 = File("testfile.txt").bufferedReader().use { it.readText() }
    println(lines2)

    val lines3 = File("testfile.txt").readText()
    println(lines3)

    /* Reads file line by line and close the resource */
    File("testfile.txt").reader().forEachLine { println(it) }

}