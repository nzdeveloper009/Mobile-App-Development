package com.example.gullfatimalearnkotlin

fun main() {
    var lambda1={a:Int,b:Int->a+b}
    println(lambda1(2,3))
    var multilineLambda={
        println("Hello")
        println("World")
        2
    }
    multilineLambda()
    println(multilineLambda()) //return value

    var sayHi={msg:String -> println("Hello $msg")}
    sayHi("Gull")
    println(calculator(2,3){a,b->a+b})

}

fun calculatoR(a:Int,b:Int,fn:(Int,Int)->Int):Int
{
  return fn(a,b)
}