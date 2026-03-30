package com.example.gullfatimalearnkotlin

open class Animal{
    open fun sound(){
        println("Animal makes a sound")
    }
}

class Dog: Animal(){
    override fun sound(){
        super.sound()
        println("Dog barks")
    }
}

class cat:Animal()
{
    override fun sound() {
        super.sound()
        println("cat meows")
    }
}

fun main(){
    val d = Dog()
    d.sound()
    val c=cat()
    c.sound()

}