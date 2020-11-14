package main.advanced

fun localDelegatedProperties() {
    val lazy by lazy { initLate() }
}

fun initLate(): String {
    throw UnsupportedOperationException("not implemented")
}

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)
    println("Hello & Bye".hasAmpersand)
}