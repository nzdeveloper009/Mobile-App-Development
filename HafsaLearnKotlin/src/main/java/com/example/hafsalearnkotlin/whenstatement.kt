package com.example.hafsalearnkotlin
fun main() {
    println("Enter Marks:")
    val marks = readLine()!!.toFloat()
    val result = when {
        marks >= 85 -> "Grade= A+"
        marks >= 80 -> "Grade= A"
        marks >= 75 -> "Grade= B+"
        marks >= 70 -> "Grade= B"
        marks >= 65 -> "Grade= C+"
        marks >= 60 -> "Grade= C"
        else -> "Fail"
    }
    println(result)
}