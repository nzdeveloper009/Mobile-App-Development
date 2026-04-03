package com.example.hafsalearnkotlin
fun main() {
    //if-else statement
    println("Enter Marks:")
    val marks = readLine()!!.toFloat()
    val result = if (marks >= 85) {
        ("Grade= A+")
    } else if (marks >= 80) {
        ("Grade= A")
    } else if (marks >= 75)
        "Grade= B+"
    else if (marks >= 70)
        "Grade= B"
    else if (marks >= 65)
        "Grade= C+"
    else if (marks >= 60)
        "Grade= C"
    else {
        "Student is Fail"
    }
    println(result)
}