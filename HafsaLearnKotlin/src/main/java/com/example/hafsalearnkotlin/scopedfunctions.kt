package com.example.hafsalearnkotlin
data class Person(var name: String, var age: Int)

fun main() {
    // apply: configure an object
    val person = Person("Hafsa", 20).apply {
        age = 21
        println("Inside apply: Updated age to $age")
    }

    // let: execute code with the object as 'it'
    person.let {
        println("Inside let: ${it.name} is ${it.age} years old")
    }

    // with: operate on an object without returning it
    with(person) {
        println("Inside with: Name length is ${name.length}, Age doubled is ${age * 2}")
    }

    // run: execute a block and return result
    val greeting = person.run {
        "Hello, my name is $name and I am $age years old."
    }
    println("Inside run: $greeting")
}
