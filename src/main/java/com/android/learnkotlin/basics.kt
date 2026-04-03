package com.android.learnkotlin

// operators
fun main() {
    var a = 12
    var b = 2
    // ****arithmetic operators*****
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
    // *******relational operartors*********
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)
    // *** increment***
    println(a++)
    println(a)
    println(++a)
    //** decrement ***
    println(b--)
    println(b)
    println(--b)

    //*** logical operators***
    var takebreakfast = true
    var takelunch = true
// ***AND operator****
    val healthy= takebreakfast && takelunch
    println(healthy) //true iff both true
    //**** OR operator****
    val  nothealthy=takebreakfast || takelunch
    println(nothealthy) // if one true true
    //*****NOT operator****
    val condition=false
    val result=!condition // reverse
    println(result)

}