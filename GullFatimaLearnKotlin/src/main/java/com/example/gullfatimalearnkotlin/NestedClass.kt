package com.example.gullfatimalearnkotlin

fun main() {

    var obj=outer.inner()
    obj.show()
    var obj1=House().Room()
    obj1.show()

}

class outer{
    private val i=0
    class inner{
        fun show() {
            println("inner ")

        }
    }
}

class House{
    private val address="123Street"
    inner class Room
    {
        fun show()
        {
            println("Address: $address")

        }

    }

}