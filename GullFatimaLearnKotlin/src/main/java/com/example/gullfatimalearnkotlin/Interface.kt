package com.example.gullfatimalearnkotlin

fun main() {
 Print(arrayOf(ElectricCar(),PetrolCar(),bike()))
}
fun Print(objects: Array<same>)
{
    for(obj in objects)
    {
        obj.EngineStarting()
    }
}
interface same{
    fun EngineStarting()
}
abstract class car:same{
    abstract fun carType()
}

class ElectricCar:car()
{
    override fun carType(){
        println("Electric Car")
    }
    override fun EngineStarting(){
        println("Electric Car Engine Starting")

    }
}

class PetrolCar:car()
{
    override fun carType(){
        println("Petrol Car")
    }
    override fun EngineStarting(){
        println("Petrol Car Engine Starting")

    }
}

class bike:same{
    override fun EngineStarting(){
        println("Bike Engine Starting")

    }
}
