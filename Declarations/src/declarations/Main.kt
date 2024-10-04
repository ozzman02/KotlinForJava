package declarations

fun main(args: Array<String>) {

    val numerator = 10.99
    val denominator = 20.00

    println("The value of $numerator divided by $denominator is ${numerator / denominator}")

    val filePath = """c:\somedir\somedir2"""

    val longText = """
        Test Test Test Test Test Test Test Test Test Test Test
        Test Test Test Test Test 
        Test Test
        Test
    """.trimIndent()

    val longText2 = """
        *Test Test Test Test Test Test Test Test Test Test Test
        *Test Test Test Test Test 
        *Test Test
        *Test
    """.trimMargin("*")

    val otherTest = "Other test"

    // default is |
    val longText3 = """$otherTest
        |$otherTest Test Test Test Test Test Test Test Test Test Test
        |$otherTest Test Test Test Test 
        |$otherTest Test
        |$otherTest
    """.trimMargin()



    println(filePath)

    println(longText)

    println(longText2)

    println(longText3)

}

class Employee(var name: String, val id: Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }

}