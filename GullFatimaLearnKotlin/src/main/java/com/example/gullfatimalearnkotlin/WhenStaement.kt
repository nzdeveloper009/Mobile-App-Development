package com.example.gullfatimalearnkotlin

fun main() {
    var number=36
    var result=when(number)
    {
        in 1..10 -> "lies in First Group"
        in 11..20 -> "lies in 2nd Group"
        in 21..30 -> "lies in 3rd Group"
        in 31..40 -> "lies in 4th  Group"
        else -> "out of range"
    }
    println(result)

    var day=4
    when(day)
    {
        1 -> println("Sunday")
        2 -> println("Saturday")
        3 -> println("Friday")
        4 -> println("Thursday")
        5 -> println("Wednessday")
        6 -> println("Tuesday")
        7 -> println("Monday")
        else -> println("Does not exist.")

    }
}