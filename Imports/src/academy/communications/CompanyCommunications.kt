package academy.communications

import java.time.Year


/*
    This one will not be visible outside of this file:
    private fun topLevel(str: String) = println("Top Level Function: $str")
*/
fun topLevel(str: String) = println("Top Level Function: $str")

object CompanyCommunications {
    val currentYear = Year.now().value
    fun getTagLine() = "Our company rocks!"
    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"
}

// Extension function
fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0, 1).uppercase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}

fun main() {
    topLevel("I am private")
}