package com.example.hafsalearnkotlin

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Step 1: Filter even numbers
    val evens = numbers.filter { it % 2 == 0 }

    // Step 2: Map each even number to its square
    val squares = evens.map { it * it }

    // Step 3: Print each squared value
    squares.forEach { println("Square: $it") }
}
