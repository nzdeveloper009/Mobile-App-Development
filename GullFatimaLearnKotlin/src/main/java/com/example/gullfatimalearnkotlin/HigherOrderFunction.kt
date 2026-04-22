package com.example.gullfatimalearnkotlin

import jdk.dynalink.Operation

fun main() {

    var fn=::sum //function type variable
    println(fn(2,3))
    calculator(2,3,::sum)
    calculator(2,3,::subbtract)

}
fun sum(a:Int,B:Int):Int=a+B

fun subbtract(a:Int,b:Int):Int=a-b


fun calculator(a:Int,b:Int,fn:(Int,Int)->Int)
{
    var operators=listOf<String>("+","-","*","/")

    if(operators.contains("+"))
    {
        println(fn(a,b))
    }
    else if(operators.contains("-"))
    {
        println(fn(a,b))
    }
}
