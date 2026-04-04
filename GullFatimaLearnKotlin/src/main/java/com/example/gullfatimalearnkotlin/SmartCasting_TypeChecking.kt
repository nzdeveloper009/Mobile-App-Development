package com.example.gullfatimalearnkotlin

fun checkVehicle(vehicle: Any)
{

    if (vehicle is String)
    {
        println("Vehicle name length: ${vehicle.length}")
    }

    if (vehicle is Int)
    {
        println("Vehicle number increased: ${vehicle + 1}")
    }
}

fun main()
{
    checkVehicle("Car")
    checkVehicle(100)
}