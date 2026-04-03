package com.example.hafsalearnkotlin

fun main() {
    //val and var difference
    var value=5
    val pi=3.14
    println("First value="+value)
    value=10 //var can be reassigned
    //val can't be reassigned
    println("Updated value="+value)
    var Firstname ="Hafsa"
    var lastname= "Javed"
    val dateofbirth= 2006
    println("Hello" + " " + Firstname + " " + lastname)
    println("Date of Birth="+dateofbirth)
    var score=5
    var addition=score +5
    println("Addition in score=" +addition)
    //Daclaring variables without datatypes
    var Text="Note: In Kotlin the type of variable is decided by its value."
    var Name= "Ali"
    var age=23
    var height=5.6
    var isstudent=true
    val myNum = 5               // Int
    val myDoubleNum = 5.99      // Double
    val myLetter = 'D'          // Char
    val myBoolean = true        // Boolean
    val myText = "Hello"        // String
    println(Text)
    println("Name="+Name)
    println("Age="+age)
    println("Height="+height)
    println(isstudent)
    println("INteger="+myNum)
    println("Double="+myDoubleNum)
    println("Letter="+myLetter)
    println(myBoolean)
    println("Text="+myText)
}

