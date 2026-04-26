package com.example.hafsalearnkotlin

fun main() {
    // A lambda expression to add two numbers
    val add: (Int, Int) -> Int = { a, b -> a + b }

    // A lambda expression to greet someone
    val greet: (String) -> String = { name -> "Hello, $name!" }

    // Using the lambdas
    val sum = add(5, 7)
    println("Sum: $sum")

    val message = greet("Hafsa")
    println(message)
}
