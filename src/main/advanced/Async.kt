package main.advanced

import java.util.concurrent.CompletableFuture

private fun startLongAsyncOperation(v: Int) = 
		CompletableFuture.supplyAsync {
			Thread.sleep(1000)
			"Result: $v"
		}

fun main(args: Array<String>){
	/*val future = async<String> {
		(1..$future).map {
			await(startLongAsyncOperation(it))
		}.joinToString("\n")
	}*/
	println("This before")
	//println(future.get())
	println("This after")
	
}