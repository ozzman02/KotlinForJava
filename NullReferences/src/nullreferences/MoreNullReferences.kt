package nullreferences

fun main() {

    val str: String? = "This is not null"

    str?.let { printText(it) }

    val str2 = str!! // exeption will be thrown here
    val str3 = str2.uppercase()
}

fun printText(text: String) {
    println(text)
}