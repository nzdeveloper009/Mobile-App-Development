package com.android.imanlearnkotlin
fun main() {

    // Using Object Declaration
    Counter.count = 5
    Counter.showCount()

    // Using Object Expression
    val student = object {
        var name = "Ali"
        var age = 18

        fun display() {
            println("Name = $name, Age = $age")
        }
    }

    student.display()
}
object Counter {
    var count = 0

    fun showCount() {
        println("Counter value = $count")
    }
}

