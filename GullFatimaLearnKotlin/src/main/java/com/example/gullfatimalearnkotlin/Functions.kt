package com.example.gullfatimalearnkotlin

fun main()
{
    greeting()
    var R=subtract(45,4)
    println(R)
    var G=add(24,2)
    println("Sum of numbers= $G")
    IsEvenOROdd(7)
    IsEvenOROdd(8)
    print()
}

fun subtract(num1:Int, num2:Int): Int
{
    var result=num1 - num2
    return result
}
fun greeting()
{
    println("welcome!")
}

fun add(num1:Int, num3:Int) = num1 +num3

//unit datatype
fun IsEvenOROdd(num:Int)
{
    var result=if(num %2==0) "Even" else "odd"
    println(result)
}

//Default argument
fun print(count:Int=2)
{
    var i=1
    for(i in 1..count)
    {
        println("Hello ")

    }
}
