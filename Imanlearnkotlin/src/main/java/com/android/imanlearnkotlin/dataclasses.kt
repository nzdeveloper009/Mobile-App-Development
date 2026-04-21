package com.android.imanlearnkotlin

fun main() {
    val s1 = Stud("Ali", 18, 85)
    // toString()
    println(s1)
    // copy()
    val s2 = s1.copy(marks = 90)
    println(s2)
    // componentN()
    val (name, age, marks) = s1
    println("Name: $name")
    println("Age: $age")
    println("Marks: $marks")
}
data class Stud(val name: String, val age: Int, val marks: Int)
