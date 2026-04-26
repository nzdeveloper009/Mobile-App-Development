package com.example.hafsalearnkotlin
// File: DataClassDemo.kt

// A data class automatically provides equals(), hashCode(), toString(), and copy()
data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Ali", 25)
    val person2 = Person("Ali", 25)
    val person3 = Person("Sara", 30)

    // equals() check
    println("person1 == person2: ${person1 == person2}") // true
    println("person1 == person3: ${person1 == person3}") // false

    // hashCode() check
    println("person1.hashCode(): ${person1.hashCode()}")
    println("person2.hashCode(): ${person2.hashCode()}")
    println("person3.hashCode(): ${person3.hashCode()}")
}
