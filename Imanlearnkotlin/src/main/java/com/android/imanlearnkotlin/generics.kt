package com.android.imanlearnkotlin

fun main() {
    val intBox = Box<Int>(10)
    val stringBox = Box<String>("Hello")

    println(intBox.value)
    println(stringBox.value)
    sum(1, 2, 3)
    sum(10, 20, 30, 40)
}
class Box<T>(var value: T)
fun sum(vararg numbers: Int) {
    var total = 0
    for (num in numbers) {
        total += num
    }
    println("Sum = $total")
}
