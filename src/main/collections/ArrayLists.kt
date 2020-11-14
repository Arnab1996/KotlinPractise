package main.collections

fun main(args: Array<String>) {
    val array = arrayOf("Monday", "Wednesday", "Friday")
    val list = listOf("Orange", "Apple", "Bananas")
    val arrayList = arrayListOf("Patrick", "Michael")
    arrayList.add("Samandra")
    println(array.contentToString())
    println(list)
    println(arrayList)

    // Arrays
    val weekdays = arrayOf("Monday", "Wednesday", "Friday")
    val mixed = arrayOf("Kotlin", 17, 4.0, false)
    val numbers = intArrayOf(1, 2, 3, 4)
    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])
    val str = "Udemy"
    println(str[0])

    val weekends = arrayOf("Saturday", "Sunday")
    val allDays = weekdays + weekends;
    println(message = allDays.contentToString())
    println(allDays.size)

    if (numbers.contains(1)) {
        println("Yes")
    }

    // Lists
    val arrayList1 = arrayListOf("Patrick", "Michael")
    val list1 = arrayListOf("Peter")
    println(arrayList1[0])
    println(arrayList1.size)
    println(arrayList1 + list1)
    println(arrayList1.isEmpty())
    println(arrayList1.contains(element = "Sarah"))
}

