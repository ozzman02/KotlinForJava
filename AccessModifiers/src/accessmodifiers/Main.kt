package accessmodifiers

val MY_CONSTANT = 100

fun main() {

    /*println(MY_CONSTANT)

    val emp = Employee("Oscar")
    println(emp.firstName)
    println(emp.fullTime)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)*/
    val car = Car("blue", "Toyota", 2015)
    println(car)

    val car2 = Car("blue", "Toyota", 2015)
    println(car2)

    println(car == car2)

    val car3 = car.copy();
    println(car3)

    val car4 = car.copy(year = 2016, color = "green")
    println(car4)
}


class Employee(val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
        get() {
            println("Running custom get")
            return field
        }
        set(value) {
            println("Running custom set")
            field = value
        }

}

class Demo {

    val dummy: String

    constructor() {
        dummy = "Dummy"
    }
}

data class Car(val color: String, val model: String, val year: Int) {

}