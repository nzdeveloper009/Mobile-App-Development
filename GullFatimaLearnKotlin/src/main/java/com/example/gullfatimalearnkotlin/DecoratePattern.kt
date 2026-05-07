package com.example.gullfatimalearnkotlin

//interface logger{
//    fun log(message:String)
//}
//
//class consoleLogger:logger {
//    override fun log(message: String) {
//        println("Console Logger: $message")
//    }
//}
//class TimeStampLogger( val logger: logger):logger {
//    override fun log(message: String) {
//        val time = java.time.LocalTime.now()
//        logger.log("$time: $message")
//
//    }
//}
//
//fun main()
//{
//    val console= consoleLogger()
//    console.log("hello")
//     TimeStampLogger(console).log("Hello")
//}


//modern version by cool kotlin
//Interface
fun interface Logger {
    fun log(message: String)
}

//Extension Functions as Decorators
fun Logger.withTimeStamp() = Logger { msg ->
    this.log("[${java.time.LocalTime.now()}] $msg")
}

fun Logger.withThreadName() = Logger { msg ->
    this.log("${Thread.currentThread().name}: $msg")
}

//
fun main() {
    val logger = Logger { println(it) } // Base logger
        .withTimeStamp()                // Wrapping with Time
        .withThreadName()               // Wrapping with Thread Name

    logger.log("Hello World!")
}