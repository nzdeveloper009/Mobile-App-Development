package com.example.gullfatimalearnkotlin

fun main() {
    var i=1
    for(i in 1..5)
    {
        println(i)
    }

    println("............")
    //until excludes last digit
    for(i in 1 until 5)
    {
        println(i)
    }

    println("............")
    var j=9
    for(j in 9 downTo 1)
    {
        println(j)
    }

    println("............")
    var k=19
    for(k in 19 downTo 1 step 3)
    {
        println(k)
    }
}