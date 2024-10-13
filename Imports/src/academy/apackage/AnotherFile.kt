package academy.apackage

import academy.communications.CompanyCommunications as Communications
import academy.communications.topLevel as tp
import academy.communications.Department.*
import academy.communications.upperFirstAndLast

fun main() {
    tp("Hello from Another File")
    println(Communications.getCopyrightLine())
    println(Communications.getTagLine())
    println(IT.getDepartmentInfo())
    println(SALES.getDepartmentInfo())
    println("another string to work with".upperFirstAndLast())
}