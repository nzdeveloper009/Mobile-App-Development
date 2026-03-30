package com.example.gullfatimalearnkotlin

fun main()
{
    println(addition(23,4))
    var result=addition(10.5f,11.2f)
    println(result)
    var sub = ::Subtraction             //function within a variable
    println(sub(10,5,2))

    println(Subtraction(C=5,a=19,b=3))//named parameters


}

fun addition(a:Int, b: Int): Int{
    return a+b
}

fun addition(a: Float, b: Float): Float{
    return a+b
}

fun Subtraction(a:Int, b:Int, C:Int): Int{
    return a-b-C
}