package com.android.learnkotlin

fun main(){
    println (add(1,2))
    println(add(1.2,2.0))
    var fn= :: subtraction // function store in variable
    println(fn(3,2))

}
// different datatype
fun add( a:Int, b:Int ):Int
{
    return a+b
}
fun add(a:Double,b:Double):Double{
    return a+b

}
fun subtraction(a:Int,b:Int):Int
{
    return a-b
}
