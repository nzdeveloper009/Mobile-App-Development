package com.example.gullfatimalearnkotlin

fun main()
{
    var i=15
    var j=5
    //Arithmetic Operator
    println(i+j)
    println(i-j)
    println(i*j)
    println(i/j)
    println(i%j)

    //Relational Operator
    println(i>j)
    println(i<j)
    println(i>=j)
    println(i<=j)
    println(i==j)
    println(i!=j)

    //Increment & Decrement
    println(i++) //= 15 post inc
    println(i)//16
    println(j--)//5
    println(--j)//3

    var k=5
    var g=9
    print(k++ + --k) //10

    //Logical Operators
    var knowsProgramming=false
    var above90=true

    var check_creteria = knowsProgramming && above90
    println(check_creteria)
    var Check_creteria = knowsProgramming || above90
    println(Check_creteria)

    var interested=false
    var answer=!interested
    println(answer)


}