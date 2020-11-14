package main.advanced

sealed class PageResult {
}

class Success(val content: String) : PageResult()
class Error(val code: Int, val message: String) : PageResult()

fun getURLPage(url: String): PageResult {
    val wasValidCall = false
    return if (wasValidCall) {
        Success("The content: ")
    } else {
        Error(404, "Not Found")
    }
}

fun main(args: Array<String>) {
    when (val pageResult = getURLPage("/")) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.message)
    }
}