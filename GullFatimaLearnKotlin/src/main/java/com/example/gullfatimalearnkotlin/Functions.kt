package com.example.gullfatimalearnkotlin

fun main()
{
    Greeting()
    var R=Subtract(45,4)
    println(R)
    var G=addi(24,2)
    println("Sum of numbers= $G")
    IsEvenOrOdd(7)
    IsEvenOrOdd(8)
    Print()
}

fun Subtract(num1:Int, num2:Int): Int
{
    var result=num1 - num2
    return result
}
fun Greeting()
{
    println("welcome!")
}

fun addi(num1:Int, num3:Int) = num1 +num3

//unit datatype
fun IsEvenOrOdd(num:Int)
{
    var result=if(num %2==0) "Even" else "odd"
    println(result)
}

//Default argument
fun Print(count:Int=2)
{
    var i=1
    for(i in 1..count)
    {
        println("Hello ")

    }
}
