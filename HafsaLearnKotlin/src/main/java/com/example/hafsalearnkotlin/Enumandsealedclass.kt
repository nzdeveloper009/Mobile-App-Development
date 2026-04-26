package com.example.hafsalearnkotlin

// Enum class
enum class Day {
    MONDAY, TUESDAY, WEDNESDAY
}

// Sealed class
sealed class Result {
    object Success : Result()
    object Failure : Result()
}

// Function to handle Result
fun handleResult(result: Result) {
    when (result) {
        Result.Success -> println("Operation was successful")
        Result.Failure -> println("Operation failed")
    }
}

fun main() {
    // Using enum class
    val today = Day.MONDAY
    println("Today is: $today")

    // Using sealed class
    val result1: Result = Result.Success
    val result2: Result = Result.Failure

    handleResult(result1)
    handleResult(result2)
}
