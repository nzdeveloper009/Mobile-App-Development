package com.example.hafsalearnkotlin
// A higher-order function: takes another function as a parameter
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    // Define some function types
    val add: (Int, Int) -> Int = { a, b -> a + b }
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    // Use the higher-order function with different operations
    val sumResult = calculate(5, 3, add)
    val productResult = calculate(5, 3, multiply)

    println("Sum: $sumResult")
    println("Product: $productResult")

    // Inline lambda usage
    val subtractResult = calculate(10, 4) { a, b -> a - b }
    println("Subtract: $subtractResult")
}
