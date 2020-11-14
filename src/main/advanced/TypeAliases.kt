package main.advanced

typealias Name1 = String

data class Employee3(val name: Name1, val email: String) {
    fun printName(string: String) {

    }
}

fun main(args: Array<String>) {
    val employee = Employee("Hadi", "Hadi@hadi")
    employee.printName("A String")
}