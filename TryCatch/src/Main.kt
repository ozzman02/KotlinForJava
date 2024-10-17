fun main() {
    println(getNumber("22.8"))
    //println(getNumber2("22.5") ?: throw IllegalArgumentException("Number isn't an Int"))
    //println(getNumber2("22.5") ?: "I can't print the result")
    notImplementedYet("string")
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("I'm in the finally block")
    }
}

fun getNumber2(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block again")
    }
}

fun notImplementedYet(something: String) {
    throw IllegalArgumentException("Implement me")
}