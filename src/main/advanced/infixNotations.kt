package main.advanced

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {
    // Extension functions with single parameters on;y
    "Hello".shouldBeEqualTo("Hello")
    val output = "Hello"
    println(output shouldBeEqualTo "Hello")
}