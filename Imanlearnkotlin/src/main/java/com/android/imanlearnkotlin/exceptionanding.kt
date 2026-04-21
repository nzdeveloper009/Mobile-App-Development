package com.android.imanlearnkotlin

fun main() {
    try {
        val age = 15
        checkAge(age)
        val num = 10 / 0
        println(num)

    } catch (e: ArithmeticException) {
        println("Math error: ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Custom error: ${e.message}")
    } finally {
        println("Program finished")
    }
}
//  throw function
fun checkAge(age: Int) {
    if (age < 18) {
        throw IllegalArgumentException("You are underage!")
    } else {
        println("Access granted")
    }
}