package com.android.imanlearnkotlin

fun main() {
    val obj = Outer.Nested()
    obj.show()
    val outer = Outer2()
    val inner = outer.Inner()
    inner.show()

}
class Outer {

    var outerValue = "I am Outer class"

    class Nested {
        fun show() {
            println("I am Nested class")
        }
    }
}
class Outer2 {

    var outerValue = "Hello from Outer class"

    inner class Inner {
        fun show() {
            println(outerValue)
            println("I am Inner class")
        }
    }
}

