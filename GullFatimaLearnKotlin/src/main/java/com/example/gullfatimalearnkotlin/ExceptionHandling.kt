package com.example.gullfatimalearnkotlin

fun main() {
    val arr: Array<Int> = arrayOf()
    try {
        println(arr[0])
    }
    catch(ex: ArrayIndexOutOfBoundsException) {
        println("Array is empty")
    }
    finally {
        println("This is finally block")
    }

    //throw keyword
    creatuser(11)
    //creatuser(-9)

}
fun creatuser(count:Int)
{
    if(count<0)
    {
        throw IllegalArgumentException("Count must be greater than 10")
    }
    else{
        println("User Created$count")

    }

}