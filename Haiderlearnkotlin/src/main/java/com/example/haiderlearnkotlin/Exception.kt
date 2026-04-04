package com.example.haiderlearnkotlin

fun main() {
    try {
        val a = 10 / 0
        println(a)
    } catch (e: Exception) {
        println("Error")
    }
}