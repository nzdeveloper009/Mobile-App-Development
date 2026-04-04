package com.example.haiderlearnkotlin

fun main() {

    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }

    for (j in 1..10) {
        if (j == 8) {
            break
        }
        println(j)
    }
}
