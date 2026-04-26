package com.example.hafsalearnkotlin

// A simple function to add two numbers
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

// A function to greet someone
fun greet(name: String?): String {
    // Use Elvis operator to handle null
    val safeName = name ?: "Maryam"
    return "Hello, $safeName!"
}

fun main() {
    // Call addNumbers
    val sum = addNumbers(5, 10)
    println("Sum: $sum")

    // Call greet with a name
    println(greet("Hafsa"))

    // Call greet with null
    println(greet(null))
}
