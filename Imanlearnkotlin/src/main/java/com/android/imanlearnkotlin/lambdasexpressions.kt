package com.android.imanlearnkotlin

fun main() {
    val square = { it: Int -> it * it }

    println(square(4))
    val sum = { a: Int, b: Int -> a + b }

        println(sum(5, 3))

    }