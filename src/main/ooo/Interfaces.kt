package main.ooo

interface Drivable {
    fun drive()
}

interface Buildable {
    fun build()
    val timeRequired: Int
}

class Car(val color: Color) : Drivable, Buildable {
    override fun drive() {
        println("Driving car...")
    }

    override fun build() {
        println("Built in one day...")
    }

    override val timeRequired: Int = 121
}

class MotorCycle(var color: String) : Drivable {
    override fun drive() {
        println("Driving car...")
    }
}

fun main(args: Array<String>) {
    val motorCycle: Drivable = MotorCycle("Red")
    motorCycle.drive()
    val car = Car(Color.RED)
    println(car.color)
    car.drive()
    car.build()
}
