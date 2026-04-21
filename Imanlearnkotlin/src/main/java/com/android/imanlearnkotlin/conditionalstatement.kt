package com.android.imanlearnkotlin

fun main() {
//***IF ELSE****

    val onlinemids = true
    if (onlinemids == true) {
        println("i definatily sleep 12 hours")
    } else {
        println("8 hours sleep")
    } // use for simple codition
    //******ladder if els****

    val css = 0
    val pms = 1
    if (css > pms) {
        println("i go for it")
    } else if (css < pms) {
        println("i will not go")
    } else {
        println("not valid")
    }
    // ***range***
    val number = 11
    val result = number in 1..5
    val result2 = number in 1 until 12
    println(result)
    println(result2)
    // **** when statement****
    val day = "sunday"
    when (day) {
        "monday" -> println("no off")
        "friday" -> println("halfday")
        "sunday" -> println("off")
        else -> println("invalid data")
    }
}

