package main.loops

import java.util.*

fun main(args: Array<String>) {
    println("Please enter option \n1. Celsius --> Fahrenheit\n2. Fahrenheit --> Celsius")
    val scanner = Scanner(System.`in`)
    when (scanner.nextInt()) {
        1 -> {
            println("Enter the temperature in Celsius")
            val C: Double = scanner.nextDouble()
            print("The temperature in Fahrenheit is : ")
            println("${C * 9 / 5 + 32} F")
        }
        2 -> {
            println("Enter the temperature in Fahrenheit")
            val F: Double = scanner.nextDouble()
            print("The temperature in Celsius is : ")
            println("${(F - 32) * 5 / 9} C")
        }
        else -> println("Invalid Choice\nExiting..")
    }
}