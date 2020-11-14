package main.advanced

interface Repository1 {
    fun getById(id: Int): CustomerEntity
    fun getAll(): List<CustomerEntity>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository1, logger: Logger) : Repository1 by repository, Logger by logger {
    fun index(): String {
        getById(2)
        logAll()
        getAll()
        return ""
    }
}