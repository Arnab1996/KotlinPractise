package main.ooo

abstract class Course(private val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

open class KotlinCourse() : Course("Kotlin", 999.99), Learnable {
    final override fun learn() {
        super<Learnable>.learn()
        println("I'm one of the first people to learn Kotlin")
    }
}

class SpecialKotlinCourse() : KotlinCourse() {
    /*override fun learn() {
        println("Learning special Kotlin course")
    }*/
}

fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()
}