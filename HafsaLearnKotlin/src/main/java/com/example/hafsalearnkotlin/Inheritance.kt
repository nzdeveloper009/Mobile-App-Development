package com.example.hafsalearnkotlin
// Base class
open class Vehicle(val Toyota: String) {
    open fun drive() {
        println("$Toyota vehicle is driving")
    }
}
// Derived class Car
class Car(brand: String) : Vehicle(brand) {
    override fun drive() {
        println("$Toyota car is driving smoothly")
    }
}
// Derived class Bike
class Bike(brand: String) : Vehicle(brand) {
    override fun drive() {
        println("$Toyota bike is speeding on the road")
    }
}
// Main function
fun main() {
    val vehicle: Vehicle = Vehicle("Toyota")
    val car: Vehicle = Car("Toyota")
    val bike: Vehicle = Bike("Honda")

    vehicle.drive()  // Toyota vehicle is driving
    car.drive()      // Toyota car is driving smoothly
    bike.drive()     // Honda bike is speeding on the road
}
