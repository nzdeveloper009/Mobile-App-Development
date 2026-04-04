package com.example.haiderlearnkotlin

fun main() {
    val obj = PersonConstructor("Ali", 20)
    println(obj.name)
    println(obj.age)
}

class PersonConstructor(var name: String, var age: Int)