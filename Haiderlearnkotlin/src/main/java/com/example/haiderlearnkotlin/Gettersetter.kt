package com.example.haiderlearnkotlin

fun main() {
    val obj = Student()
    obj.name = "Ali"
    println(obj.name)
}

class Student {
    var name = ""
        get() = field
        set(value) {
            field = value
        }
}