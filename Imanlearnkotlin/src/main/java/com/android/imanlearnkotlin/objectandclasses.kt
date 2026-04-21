package com.android.imanlearnkotlin

fun main(){
    val  mustang = Car("Mustang","petrol",100,"jarer")
    println(mustang.name)
    println(mustang.ambassador)
    mustang.drivecar()
}
class Car ( val name:String,val type:String ,var  kmrun:Int,val ambassador:String)
//properties
{
    fun drivecar(){ //methods
        println("$name car driving")

    }
    fun applybrakes(){
        println("applied brakes")
    }
}