package com.example.hafsalearnkotlin
// Extension function: adds a new function to Int
fun Int.factorial(): Long {
    var result = 1L
    for (i in 1..this) {
        result *= i
    }
    return result
}

// Inline function: repeats an action multiple times
inline fun repeatAction(times: Int, action: (Int) -> Unit) {
    for (i in 1..times) {
        action(i)
    }
}

fun main() {
    // Using the extension function
    val number = 5
    println("Factorial of $number is: ${number.factorial()}")

    // Using the inline function
    repeatAction(3) { attempt ->
        println("Attempt #$attempt: Keep learning Kotlin!")
    }
}
