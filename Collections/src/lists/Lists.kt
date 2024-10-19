package lists

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass) // class java.util.Arrays$ArrayList -> Immutable
    println(strings)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass) // class kotlin.collections.EmptyList

    val emptyIntList: List<Int> = emptyList()

    val strings1 = listOf<String>() // Immutable list

    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList) // [hello, goodbye]

    val arrayList = arrayListOf(1, 2, 4)
    println(arrayList.javaClass) // class java.util.ArrayList -> Mutable

    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass) // class java.util.ArrayList -> Mutable
    println(mutableList[2])
    mutableList[1] = 20
    println(mutableList)


    /*** Convert array to list begin ***/
    val array = arrayOf("black", "white", "green")
    val colorList = listOf(array)
    println(colorList) // [[Ljava.lang.String;@4edde6e5] -> List with one element, the array

    val colorList2 = listOf(*array)
    println(colorList2) // [black, white, green]

    val colorList3 = array.toList()
    println(colorList3) // better way ! ->  [black, white, green]

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList()) // [1, 2, 3]
    /*** Convert array to list ends ***/

}