package com.example.hafsalearnkotlin
//Arrays
fun main() {
    val numbers = arrayOf(10, 20, 30, 40, 50)

    // Print all elements using a for loop
    println("Array elements:")
    for (num in numbers) {
        println(num)
    }

    //Access elements by index
    println("First element: ${numbers[0]}")
    println("Last element: ${numbers[numbers.size - 1]}")

    //Modify an element
    numbers[2] = 99
    println("After modification: ${numbers.joinToString()}")

    // Indices loop
    println("Array with indices:")
    for (i in numbers.indices) {
        println("Index $i → ${numbers[i]}")
    }

    //Sum of elements
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    println("Sum of elements: $sum")

    //Maximum element
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    println("Maximum element: $max")

    //Build in functions
    println("Array size: ${numbers.size}")
    println("Sorted array: ${numbers.sorted()}")
}
