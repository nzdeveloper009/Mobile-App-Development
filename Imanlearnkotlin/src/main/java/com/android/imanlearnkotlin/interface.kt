package com.android.imanlearnkotlin
fun main() {
    val s: Student = Iza()
    s.study()
    s.exam()
}
interface Student {
    fun study()
    fun exam()
}
class Iza: Student {
    override fun study() {
        println("Iza is studying")
    }

    override fun exam() {
        println("Iza is giving exam")
    }
}

