package com.example.haiderlearnkotlin

fun main() {

    var name: String? = "Ali"
    println(name)

    name = null
    println(name)

    var length = name?.length
    println(length)

    var length2 = name?.length ?: 0
    println(length2)

    var result = name!!.length
    println(result)
}