package com.example.haiderlearnkotlin

fun main() {
    val obj = ChildInterface()
    obj.show()
}

interface ParentInterface {
    fun show()
}

class ChildInterface : ParentInterface {
    override fun show() {
        println("Interface implemented in Child")
    }
}