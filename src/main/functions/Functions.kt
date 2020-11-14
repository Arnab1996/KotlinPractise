package main.functions


import java.util.*

fun helloWorld() {
    println("Hello World!")
}

fun printWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    return if (a >= b) a
    else b
}

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin is awesome")
    println(getCurrentDate())
    println(
        max(
            23,
            45
        )
    )
}