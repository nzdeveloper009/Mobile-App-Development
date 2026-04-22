package com.example.gullfatimalearnkotlin

//open class Ride{
//    open fun calculateFare(distance:Int):Int{
//        return distance * 50;
//    }
//
//}
//
//class CarRide: Ride() {
//    override fun calculateFare(distance: Int): Int {
//        return super.calculateFare(distance)
//    }
//}
//
//class FareFree: Ride(){
//    override fun calculateFare(distance: Int): Int {
//        throw Exception("Fare is free")
//    }
//}
//
//fun main(){
//    val ride = Ride()
//    val carRide = CarRide()
//    val fareFree = FareFree()
//     carRide.calculateFare(10)
//    fareFree.calculateFare(10)
//    //program will crash as fare is free
//
//}

interface Ride{
    fun start()
}

interface CalculateFare{
    fun calculateFare(distance:Int):Int
}

class CarRide: Ride, CalculateFare{
    override fun start() {
        println("Car Ride Started")
    }
    override fun calculateFare(distance: Int): Int {
        return distance * 50
    }
}

class FreeFare: Ride {
    override fun start() {
        println("Free Ride Started")
    }
}



fun main() {
    val freeRide = FreeFare()
    freeRide.start()
    val carRide = CarRide()
    carRide.start()
    carRide.calculateFare(10)
}



