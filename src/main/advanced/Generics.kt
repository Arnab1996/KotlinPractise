package main.advanced

open class Entity(val id: Int)

class Repository<T : Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {
            //..
        }
    }
}s

fun main(args: Array<String>) {
    val repo = Repository<CustomerEntity>()
}

class CustomerEntity(id: Int) : Entity(id) {
}