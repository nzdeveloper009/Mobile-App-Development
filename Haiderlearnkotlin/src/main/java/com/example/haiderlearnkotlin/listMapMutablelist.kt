package com.example.haiderlearnkotlin

fun main() {

    val list = listOf("Ali", "Sara", "Ahmed")
    println("List:")
    for (i in list) {
        println(i)
    }

    val map = mapOf(1 to "Ali", 2 to "Sara")
    println("Map:")
    for (i in map) {
        println(i.key.toString() + " -> " + i.value)
    }
}

