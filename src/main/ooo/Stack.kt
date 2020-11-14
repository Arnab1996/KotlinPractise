package main.ooo

// DRY = don't repeat yourself
class Stack<E>(private vararg val items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    private fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)
}

fun main(args: Array<String>) {
    val stack = Stack(1, 5, 8, 9)
    stack.push(11)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stack2 = stackOf("Hi", "Hey", "Hello")
    for (i in 1..3) {
        println(stack2.pop())
    }
}