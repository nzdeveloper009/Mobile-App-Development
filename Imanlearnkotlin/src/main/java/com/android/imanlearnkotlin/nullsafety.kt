package com.android.imanlearnkotlin

fun main(){
    var gender: String = "male"
    var gender2: String? = null

    if (gender2 != null) {
        println(gender2.uppercase())
    }

    println(gender2?.uppercase())

    gender2?.let {
        println("line 1")
        println("line 2 $gender2")
        println("line 3 $it")
    }

    var selectedvalue: String = gender2 ?: "NA"
    var value: String = gender2?.uppercase() ?: "DEFAULT"

    println(selectedvalue)
    println(value)
}