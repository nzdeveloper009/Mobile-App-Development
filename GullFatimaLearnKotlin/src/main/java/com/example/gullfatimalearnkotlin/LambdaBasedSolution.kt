package com.example.gullfatimalearnkotlin


fun main() {

    // Lambda ek variable mein store karo — ye hi "observer" hai
    val observers = mutableListOf<(Int) -> Unit>()

    // Add karo observers — koi class nahi, seedha lambda
    val gullUpdate: (Int) -> Unit = { temp ->
        println("Gull got temp update: $temp")
    }

    val amalUpdate: (Int) -> Unit = { temp ->
        println("Amal got temp update: $temp")
    }

    observers.add(gullUpdate)
    observers.add(amalUpdate)

    // Notify karo
    fun tempUpdate(newTemp: Int) {
        for (observer in observers) {
            observer(newTemp)  // lambda ko call karo
        }
    }

    tempUpdate(35)
}