package main.advanced

inline fun <T> Iterable<T>.MyforEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

// local return goes to the nearest fun

fun containingFunction() {
    val numbers = 1..100
    numbers.MyforEach myLabel@{
        if (it % 5 == 0)
            return@myLabel
    }
    println("Hello!")
}

fun containingFunction2() {
    val numbers = 1..100
    numbers.forEach(fun(element) {
        if (element % 5 == 0) {
            return
        }
    })
    println("Hello!")
}

fun main(args: Array<String>) {
    containingFunction()
    containingFunction2()
}