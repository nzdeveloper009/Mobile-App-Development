package com.android.imanlearnkotlin
fun main() {
    val c = Circle()
    c.area()

}
abstract class Shape {
    abstract fun area()
}

class Circle : Shape() { var radius = 5
    override fun area() {
        println("Area of Circle: ${3.14* radius * radius}")
    }
}