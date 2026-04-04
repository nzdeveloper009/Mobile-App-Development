package com.example.gullfatimalearnkotlin

abstract class SHAPE {
    abstract fun area(): Double
}

class CIRCLE(val radius: Double) : SHAPE() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class RECTANGLE(val width: Double, val height: Double) : SHAPE() {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val circle: SHAPE = CIRCLE(5.0)
    val rectangle: SHAPE = RECTANGLE(4.0, 6.0)
    println("Circle area: ${circle.area()}")
    println("Rectangle area: ${rectangle.area()}")
}
