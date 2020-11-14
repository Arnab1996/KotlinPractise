package main.advanced

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After calling op()")
}

inline fun tryingToInline(noinline op: () -> Unit) {
    val reference = op
    println("Assigned value")
    op()
}

fun anotherFunction() {
    operation { println("This is the actual op function") }
}

fun main(args: Array<String>) {
    operation { println("This is the actual op function") }
}