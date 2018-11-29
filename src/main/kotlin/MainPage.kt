import kotlinx.coroutines.*

fun main(){
    //println("Hello world")

    getLongRunningMethodResult()
}

fun firstExample() {
    GlobalScope.launch {
        delay(1000)
        println("How are you?")
    }

    Thread.sleep(2000)
    println("Stop")
}


fun getLongRunningMethodResult() = runBlocking {

    val value = withContext(Dispatchers.Default) { calculateTotalNumberOfRows() }
    println(Thread.currentThread().name)
    println(value)

}


suspend fun calculateTotalNumberOfRows(): Int{
    delay(1000)
    println(Thread.currentThread().name)
    return 5
}