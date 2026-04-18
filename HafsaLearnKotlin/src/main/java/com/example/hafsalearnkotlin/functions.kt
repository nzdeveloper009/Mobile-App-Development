package com.example.hafsalearnkotlin
//Inline Function
fun multiply(a: Int, b: Int)/*parameters*/: Int = a * b
fun greet(name: String): String {
    return "Hello, $name!"
}

fun main() {
    println("Result=" +multiply(3, 4))//Arguments
    println(greet("Hafsa"))
}
