package main.advanced

import kotlin.properties.Delegates

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData) {
    var department: String by Delegates.observable("", { property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    })

    fun printName(string: String) {

    }
}

fun main(args: Array<String>) {
    val employee = Employee("Hadi", "mail@hadiharir.com")
    employee.printName("A String")
    employee.department = "IT"
}