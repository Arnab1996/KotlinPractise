package main.advanced

interface Repository2 {
    fun getAll(): List<CustomerEntity>
}

class CustomerController() {
    lateinit var repository: Repository2
    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {
    val customerController = CustomerController()
    customerController.index()
}