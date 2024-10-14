package ifexpression

fun main() {
    val someCondition = 69 < 22
    val num = if (someCondition) 50 else 592

    println(num)

    if (someCondition) {
        println("something")
    } else {
        println("something else")
    }

    val num2 = if (someCondition) {
        println("something")
        50
    } else {
        println("something else")
        592
    }

    println(num2)

    println("The result of the if expression is ${if (someCondition) {
        println("something")
        50
    } else {
        println("something else")
        592
    }}")

    val x = if (someCondition) println("something") else println("something else")
    println(x)
    println(x.javaClass)


}


