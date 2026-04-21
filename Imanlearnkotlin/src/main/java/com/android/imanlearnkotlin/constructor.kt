package com.android.imanlearnkotlin

fun main() {

    // 1. Default (empty) constructor
    val d1 = Dress()
    println("d1 -> Type: ${d1.type}, Color: ${d1.color}, Price: ${d1.price}")
    println()

    // 2. Primary constructor
    val d2 = Dress("Formal")
    println("d2 -> Type: ${d2.type}, Color: ${d2.color}, Price: ${d2.price}")
    println()

    // 3. Secondary constructor
    val d3 = Dress("Party", "Red", 5000)
    println("d3 -> Type: ${d3.type}, Color: ${d3.color}, Price: ${d3.price}")
}


// Class Dress
class Dress(var type: String = "Casual") {   // Primary constructor with default value

    var color: String = "Black"
    var price: Int = 0

    // init block (runs with primary constructor)
    init {
        println("Dress created with type: $type")
    }

    // Secondary constructor
    constructor(type: String, color: String, price: Int) : this(type) {
        this.color = color
        this.price = price
        println("Secondary constructor called")
    }
}