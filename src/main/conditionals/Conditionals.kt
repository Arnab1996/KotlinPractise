package main.conditionals

fun main(args: Array<String>) {
    val name: String = "Arnab"

    if ("Arnab" == name) {
        println("Yes correct")
    } else {
        println("No not correct")
    }
    val mode: Int = 2
    when (mode) {
        1 -> println("This mode is lazy.")
        2 -> {
            println("This is optimal mode.")
            println("Let's use this")
        }
        3 -> println("This is hyper-active mode.")
        else -> println("I am not aware of that mode")
    }

    val result: String = when (mode) {
        1 -> "This mode is lazy."
        2 -> {
            println("This is optimal mode.")
            val age: Int = 3
            "Let's use this $age"
        }
        3 -> "This is hyper-active mode."
        else -> "I am not aware of that mode"
    }

    val x = if (mode < 3) {
        17
    } else {
        42
    }
    println(x)
    println(result)

    val y = 10
    when (y) {
        5 -> println("y is 5")
        3 * 12 -> println("y is 3*12")
        "Hey There".length -> println("y is the length of the string 'Hey There'")
        in 1..10 -> println("y is between 1 and 10")
        in 11..20 -> println("y is between 11 and 20")
        in 21..30 -> println("y is between 21 and 30")
        !in 1..9 -> println("y is not between 1 and 9")
    }
}