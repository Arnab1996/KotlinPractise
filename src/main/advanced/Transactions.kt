package main.advanced

import java.lang.reflect.Type
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

class Transaction(val id: Int, val amount: Double, var description: String) {
    fun validate() {
        if (amount > 10000) {
            println("Transaction too large")
        }
    }
}

fun introspectInstance(obj: Any) {
    println("Class ${obj.javaClass.simpleName}")
    println("Properties\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions\n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name} of type ${it.returnType}")
    }

}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {
    getType(Transaction::class.java)
    introspectInstance(Transaction(1, 200.0, "A simple Transaction"))

    println(Transaction::class)
    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }

    getKotlinType(Transaction::class)

    val constructor = ::Transaction
    println(constructor)

    val transaction = constructor.call(1, 2000, "Some description")
    val validateFunc = Transaction::validate
    println(transaction.description)

    val transaction2 = constructor.callBy(mapOf(constructor.parameters[0] to 1, constructor.parameters[1] to 2000))
    println(transaction2.description)

    val idParam = constructor.parameters.first { it.name == "id" }

    val amountParam = constructor.parameters.first { it.name == "amount" }

    val transaction3 = constructor.callBy(mapOf(idParam to 1, amountParam to 2000))
    println(transaction3.description)

    val trans = Transaction(1, 20.0, "New Value")

    /* val nameProperty = Transaction::class.memberProperties.find(it.name == "description")
     println(nameProperty?.get(trans))*/

}