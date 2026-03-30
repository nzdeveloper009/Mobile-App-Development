package com.example.gullfatimalearnkotlin

fun main() {
    var arr=arrayOf(1,2,3,4,5,6,7,8)
    for(i in arr )
    {
        println(i)
    }

    println("...........................")
    for((i,e)in arr.withIndex())
    {
        println("$i - $e")
    }

    println(arr.size)
    println(arr[3])
    arr.set(0,9)
    println(arr[0])
}