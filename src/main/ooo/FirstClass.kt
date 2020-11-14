package main.ooo

class House(val height: Double, val color: String, val price: Int = 50000) {
    fun print() {
        println("House(height=$height, color='$color', price=$price)")
    }
}

abstract class Person(open val name: String, open var age: Int) {

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYear(): Int = 2020 - age
}

class Student(override val name: String, override var age: Int, val studentId: Long) : Person(name, age) {
    override fun speak() {
        println("Hi there!, I am a student")
    }

    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int) : Person(name, age) {
    override fun speak() {
        println("Hi There!, I am an employee")
    }

    fun receivedPayment() {
        println("Received Payment")
    }
}

fun main(args: Array<String>) {
    /*val person = Person("Jack", 23)
    println(person.name)
    println(person.age)
    person.speak()
    person.greet("World")
    println(person.getYear())*/

    val house = House(4.5, "Blue", 150000)
    val redHouse = House(color = "Red", price = 209000, height = 5.0)
    house.print()
    redHouse.print()
    val yellowHouse = House(color = "Yellow", height = 2.6)
    yellowHouse.print()

    val student = Student("John", 25, 10000)
    println(student.isIntelligent())
    student.speak()
    val emp1 = Employee("Mary", 25)
    emp1.receivedPayment()
    emp1.speak()
}