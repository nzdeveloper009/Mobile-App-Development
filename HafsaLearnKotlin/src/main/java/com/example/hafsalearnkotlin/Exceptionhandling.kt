package com.example.hafsalearnkotlin
fun main() {
    val numbers = arrayOf(1, 2, 3)

    try {
        // Accessing an invalid index
        val value = numbers[5]
        println("Value: $value")
    } catch (e: ArrayIndexOutOfBoundsException) {
        // Handle the exception
        println("Caught an exception: ${e.message}")
    } finally {
        // Always runs
        println("Array access attempt finished.")
    }
}


