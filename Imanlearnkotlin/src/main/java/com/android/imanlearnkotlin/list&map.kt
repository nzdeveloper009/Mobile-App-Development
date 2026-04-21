package com.android.imanlearnkotlin

fun main() {
    // Immutable List
    val fruits = listOf("Apple", "Banana", "Mango")
    println(fruits)
    // Mutable List
    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4)    // add element
    numbers.remove(2)   // remove element
    println(numbers)
    println(fruits[0]) // Access element
    // Loop
    for (item in fruits) {
        println(item)
    }
    // Immutable Map
    val student = mapOf("name" to "Iman", "age" to 18, "city" to "Lahore")
    println(student)
    // Mutable Map
    val marks = mutableMapOf("Math" to 90, "Physics" to 85)
    marks["Computer"] = 95   // add
    marks["Math"] = 92       // update
    marks.remove("Physics")  // remove
    println(marks)
    println(student["name"])// Access value
    // Loop
    for ((key, value) in marks) {
        println("$key = $value")
    }

}