package com.example.hafsalearnkotlin

// Object Declaration (Singleton)
object MySingleton {
    val name = "I am a Singleton"

    fun showName() {
        println(name)
    }
}
fun main() {
    // Using object declaration
    MySingleton.showName()

    // Object Expression (Anonymous object)
    val obj = object {
        val message = "Hello from anonymous object"
        fun sayHello() {
            println(message)
        }
    }

    // Using object expression
    obj.sayHello()
}
