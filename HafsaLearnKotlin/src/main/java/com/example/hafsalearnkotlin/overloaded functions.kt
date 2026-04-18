package com.example.hafsalearnkotlin
import kotlin.math.pow
// Overloaded functions
fun divide(a: Int, b: Int): Int {
    return a / b
}
fun divide(a: Double, b: Double): Double {
    return a / b
}
fun power(base: Double, exponent: Double): Double {
    return base.pow(exponent)
}

fun main() {
    println("divide(10, 2) = " + divide(10, 2))
    println("divide(10.0, 3.0) = " + divide(10.0, 3.0))
    val result = power(2.0, 3.0)
    println("power(2.0, 3.0) = $result")
}


