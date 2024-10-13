package amodule

import academy.communications.CompanyCommunications
import academy.communications.Department.IT
import academy.communications.Department.SALES
import academy.communications.topLevel
import academy.communications.upperFirstAndLast as myExtensionFunction

fun main() {
    topLevel("Hello from Another Module")

    /*
        This one is not visible because it is internal
        println(CompanyCommunications.getCopyrightLine())
    */

    println(CompanyCommunications.getTagLine())
    println(IT.getDepartmentInfo())
    println(SALES.getDepartmentInfo())
    println("a string to work with".myExtensionFunction())
}