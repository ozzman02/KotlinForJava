package nullreferences

fun main() {

    // nullable variable
    val str: String? = null

    // nullable variable
    val str2: String? = "This isn't null"

    if (str2 != null) {
        str2.uppercase()
    }

    // instead of using if to check null use the line below
    str2?.uppercase()

    val str3: String? = null
    // There is no null pointer exception
    println("What happens when we do this: ${str3?.uppercase()}")

    val str4: String? = "Test"
    println("What happens when we do this: ${str4?.uppercase()}")

    // safe cast operator
    // val countryCode: String? = bankBranch?.address?.country?.countryCode

    // Elvis operator allows to assign a default value if a variable is null
    val str5 = str ?: "This is the default value"
    println(str5)

    // val countryCode: = bankBranch?.address?.country ?: "US"

    val something: Any = arrayOf(1, 2, 3, 4)
    val str6 = something as? String
    println(str6?.uppercase())

    // non null assertion
    // with ? you will never get a null pointer exception
    val str7: String? = null
    val test = str7!!.uppercase(); // here you will get a null pointer ex

    if (str7 == null) {
        throw Exception()
    } else {
        str7.uppercase();
    }

}