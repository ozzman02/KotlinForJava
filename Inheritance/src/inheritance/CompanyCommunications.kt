package inheritance

import java.time.Year

fun main() {

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.Companion.accessPrivateVar())

    // Companion can be removed that's why we write SomeClass.justAssign("this is the string as it is")
    val someClass1 = SomeClass.justAssign("this is the string as it is")

    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as it is", false)

    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })

    println(thisIsMutable)

    println(Department.ACCOUNTING.getDepartmentInfo())

}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"
}


object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."

}

class SomeClass private constructor(val someString: String) {

    companion object {

        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, lowercase: Boolean): SomeClass {
            if (lowercase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }

    }

}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}