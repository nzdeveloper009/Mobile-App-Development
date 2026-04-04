package com.example.haiderlearnkotlin

fun main() {
    val obj: ParentPoly = ChildPoly()
    obj.show()
}

open class ParentPoly {
    open fun show() {
        println("This is Parent class")
    }
}

class ChildPoly : ParentPoly() {
    override fun show() {
        println("This is Child class")
    }
}