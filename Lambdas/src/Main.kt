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
}

fun topLevel() = println("I'm in a function")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}