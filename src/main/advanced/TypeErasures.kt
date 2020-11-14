package main.advanced

fun <T> printList(list: List<*>){
	when(list){
		is List<*> -> println("This is a list of Strings")
		is List<*> -> println("This is a list of Numbers")
	}
	
	if(list is List<*>){
		println("This is a list")
	}
}

fun <T> printList(obj: T){
	when(obj){
		is String -> println("This is Strings")
		is Int -> println("This is Int")
	}
}

inline fun <reified T> erased(input: List<Any>){
	if(input is T){
	
	}
}

inline fun <reified T> typeInfo(){
	println(T::class)
}


fun main(args: Array<String>){
	val listStrings = listOf("One", "Two", "Three")
	val listNumbers = listOf(1, 2, 3)
	
}