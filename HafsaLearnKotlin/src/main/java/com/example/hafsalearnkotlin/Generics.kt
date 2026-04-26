package com.example.hafsalearnkotlin

// Generic function with vararg to find maximum
fun <T : Comparable<T>> maxOfAll(vararg items: T): T {
    var max = items[0]
    for (item in items) {
        if (item > max) {
            max = item
        }
    }
    return max
}

fun main() {
    // Using with Ints
    println("Max of Ints: " + maxOfAll(10, 25, 7, 42, 18))

    // Using with Doubles
    println("Max of Doubles: " + maxOfAll(2.5, 7.8, 3.1))

    // Using with Strings
    println("Max of Strings: " + maxOfAll("Apple", "Orange", "Banana"))
}
