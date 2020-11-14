package main.advanced

fun foo(fooParam: String) {
    val outerFunction = "Value"
    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
}

fun main(args: Array<String>) {
    foo("Some Value")
    // Cannot call bar(), since it is local to foo()
    // can't be accessed from outside
}