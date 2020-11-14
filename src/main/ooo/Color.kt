package main.ooo

enum class Color(val rgb: Int) {
    RED(0xFF0000), BLUE(0x0000FF), GREEN(0x00FF00), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

class ColorWrong {
    public val RED = 1
    public val BLUE = 2
    public val GREEN = 3
}

fun main(args: Array<String>) {
    // 0..1 --> 0b1010 (binary)
    // 0..9 -> 2137 (decimal)
    // 0..9, A..F -> 0x10 (Hexadecimal)
    println(0x10) // 16
    println(0x1F) // 31
    println(0x20) // 32
    println(0xFF) //255
    println(0xCAFEBABE)

    println(0x000000) //black
    println(0xFFFFFFF) // white
    println(0xFF0000) // red
    println(0x00FF00) // green
    println(0x0000FF) // blue
    println(0x000088) //dark blue

    println(0b00001010)
    println(0b11111111 == 0xFF)
    println(0b11111111_00000000_00000000 == 0xFF0000)
    println(0b1101 and 0b0011)
    println(1 and 1 == 1)

    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

    // bitwise operations
    println(0b1101 or 0b1000)
    println(0b1101 xor 0b1000)

    // inverse

    println(0b10011.inv() and 0x0000001F)
}