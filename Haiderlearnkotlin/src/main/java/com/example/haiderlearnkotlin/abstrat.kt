package com.example.haiderlearnkotlin

fun main() {
    val obj = ChildAbstract()
    obj.show()
}

abstract class ParentAbstract {
    abstract fun show()

    fun display() {
        println("Normal function in abstract class")
    }
}

class ChildAbstract : ParentAbstract() {
    override fun show() {
        println("Abstract method implemented")
    }
}