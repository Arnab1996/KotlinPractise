package main.ooo

import main.functions.getCurrentDate
import main.ooo.Color.BLUE
import java.math.BigInteger

class SomePerson(val name: String, var age: Int) {
    init {
        println("Object was created")
        val bigInt = BigInteger("3")
        println(bigInt)
        println(getCurrentDate())
        println(BLUE)
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth() = 2020 - age
}

fun main(args: Array<String>) {
    val person = SomePerson("Jack", 17)
    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)
}