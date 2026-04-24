package com.android.imanlearnkotlin
open class Bird
interface Flyable {
    fun fly()
}
class Sparrow : Bird(), Flyable {
    override fun fly() {
        println("Sparrow is flying")
    }
}
class Eagle : Bird(), Flyable {
    override fun fly() {
        println("Eagle is flying high")
    }
}
class Penguin : Bird() {
    fun swim() {
        println("Penguin is swimming")
    }
}
fun main() {

    val sparrow: Flyable = Sparrow()
    val eagle: Flyable = Eagle()

    sparrow.fly()
    eagle.fly()

    val penguin = Penguin()
    penguin.swim()
}
