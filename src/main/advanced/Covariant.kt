package main.advanced

fun main(args: Array<String>) {
    operate(listOf<Employee1>())
    operate(listOf<Person>())
    //val ro = ReadOnlyRepoImpl<Customer>()
    //ro.getAll()
}

open class Person
class Employee1 : Person()

fun operate(person: List<Person>) {

}

interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

