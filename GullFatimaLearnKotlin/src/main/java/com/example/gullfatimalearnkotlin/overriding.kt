package com.example.gullfatimalearnkotlin

open class AnimaL{
    open fun sound(){
        println("Animal makes a sound")
    }
}

class DoG: AnimaL(){
    override fun sound(){
        super.sound()
        println("Dog barks")
    }
}

class caT:AnimaL()
{
    override fun sound() {
        super.sound()
        println("cat meows")
    }
}

fun main(){
    val d = DoG()
    d.sound()
    val c=caT()
    c.sound()

}