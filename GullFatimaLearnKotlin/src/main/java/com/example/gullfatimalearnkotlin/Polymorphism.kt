package com.example.gullfatimalearnkotlin

open class Shape
{
    open fun area():Double
    {
        return 0.0
    }

}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(val width:Double, val height:Double): Shape()
{
    override fun area(): Double {
        return width * height
    }

}

fun main()
{
    val circle:Shape=Circle(5.0)
    val rectangle:Shape=Rectangle(4.0,6.0)
}
