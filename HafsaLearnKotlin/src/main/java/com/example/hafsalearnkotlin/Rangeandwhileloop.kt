package com.example.hafsalearnkotlin
//count down using do while loop
fun main(){
    var num=2
    var index=1
    println("Table of two:")
    while(index<=10){
        var result=num*index
        println("$num * $index= "+ result)
            index++
    }
}