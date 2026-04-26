package com.example.hafsalearnkotlin

class CompanionClass {
    companion object {
        // Normal companion property
        val normalValue = "Hello from Companion"

        // JVM static property
        @JvmStatic val staticValue = "Hello from @JvmStatic"

        // Normal companion function
        fun normalFunction() {
            println("This is a normal companion function")
        }

        // JVM static function
        @JvmStatic fun staticFunction() {
            println("This is a @JvmStatic function")
        }
    }
}

fun main() {
    // Accessing companion members
    println(CompanionClass.normalValue)
    CompanionClass.normalFunction()

    // Accessing JVM static members
    println(CompanionClass.staticValue)
    CompanionClass.staticFunction()
}
