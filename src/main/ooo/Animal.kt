package main.ooo

open class Animal {
    private var age: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    public fun isOld(): Boolean {
        return age > 12
    }

    protected var name: String = "Sam"
    internal val isDangerous: Boolean = true
}

class Vertebrate : Animal() {
    fun introduceYourself() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    val animal = Animal()

}