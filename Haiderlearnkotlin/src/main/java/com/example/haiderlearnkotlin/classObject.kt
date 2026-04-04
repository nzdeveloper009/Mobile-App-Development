package com.example.haiderlearnkotlin

fun main() {
    val obj = Person()
    obj.name = "Ali"
    obj.age = 20
    obj.show()
}

class Person {
    var name = ""
    var age = 0

    fun show() {
        println(name)
        println(age)
    }
}