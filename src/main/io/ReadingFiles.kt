package main.io

import java.io.File

fun main(args: Array<String>) {
    var lineNumber = 0
    File("src/resources/inputFile.txt").forEachLine {
        ++lineNumber
        println("#$lineNumber: $it")
    }
}

