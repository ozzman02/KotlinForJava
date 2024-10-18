fun main() {

    run { println("I'm in a lambda!") }

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    println(employees.minBy { e: Employee -> e.startYear })
    println(employees.minBy { e -> e.startYear })
    println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))

    println()

    var num = 10
    run {
        num += 15
        println(num)
    }

    println()

    run(::topLevel)

    println()

    println(countTo100())
    println(countTo100With())
    println(countTo100Apply())

    println()

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    println()

    "Some String".apply someString@ {
        "Another String".apply {
            println(lowercase())
            println(this@someString.uppercase())
        }
    }
}

fun topLevel() = println("I'm in a function")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo100With() = with(StringBuilder()) {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

fun countTo100Apply() = StringBuilder().apply {
    for (i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
}.toString()

fun findByLastName(employees: List<Employee>, lastName: String) {
    // return from the lambda not from the function
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return@returnBlock
        }
    }
    // this line will be executed
    println("No, there's no employee with the last name $lastName")
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}