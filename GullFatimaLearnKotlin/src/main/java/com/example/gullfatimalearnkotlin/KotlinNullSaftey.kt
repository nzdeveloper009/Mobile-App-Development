package com.example.gullfatimalearnkotlin

fun main() {
    var gender: String?=null //nullable type...accept null value
    println(gender?.uppercase() )//safe call operator...if gender!=null then execute uppercase()

    gender?.let{
        println("line 1")
        println("line 2")
        println("line 3")
        println("$it")
    }

    var selectedValue: String=gender?:"NA" //elvis operator or null policy operTOR
    //elvis checks if gender==null then store this value
    //var value=gender!!.uppercase()//not null assertion operator
    //used when we are sure that value is not null or wanna print error
    //println(value)

}
