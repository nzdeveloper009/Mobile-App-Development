package com.example.gullfatimalearnkotlin

fun main()
{
    println(additioN(23,4))
    var result=additioN(3.4,5.5,6.7)
    println(result)
    var sub = ::SubtractioN             //function within a variable
    println(sub(10,5,2))

    println(SubtractioN(C=5,a=19,b=3))//named parameters


}

fun additioN(a:Int, b: Int): Int{
    return a+b
}

fun additioN(a: Double, b: Double, c: Double): Double{
    return a+b
}

fun SubtractioN(a:Int, b:Int, C:Int): Int{
    return a-b-C
}