package com.example.gullfatimalearnkotlin

fun main()
{
    var c1= Calculator()
    c1.add(23,4)
    var std1=Students("Asad","24011519-010",19,24,4)
    var std2=Students("Riya","24011519-011",21,23,6)
    std1.display()
    println(std2.name)
    var p1=PERSON("Gull")
    var p2=PERSON("amal",17)
}

//default constructor will be called.
//default constructor has zero parameter
class Calculator
{
    fun add(a:Int, b:Int)
    {
        println(a+b)
    }

}
//primary constructor
class Students(var name:String,val RollNo:String, var Age:Int, val batch:Int, var semester:Int )
{
    fun display(){
        println("Name: $name")
        println("RollNo: $RollNo")
        println("Batch: $batch")
        println("Name: $semester")
    }
}

open class PERSON
{
    var name:String=""
    var age:Int=0

    //Secondary constructor
    constructor(name:String)
    {
        this.name=name
        this.age=19
    }
    constructor(name:String,age:Int)
    {
        this.name=name
        this.age=age
    }

}

