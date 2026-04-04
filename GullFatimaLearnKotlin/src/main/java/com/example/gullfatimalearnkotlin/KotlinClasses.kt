package com.example.gullfatimalearnkotlin

fun main() {
    val std1=studenT("Gull",19)
    val std2=std1.copy("Amal")
    with(std1)
    {
        println(name)
        println(age)
    }
    with(std2)
    {
        println(name)
        println(age)
    }
   println(std1.hashCode())
    println(std2.hashCode())
    println(std1==std2)
    println("......................")
    println(std1===std2)
}

data class studenT(val name:String,val age:Int)
