package com.example.gullfatimalearnkotlin

interface Engine{
    fun start()
}

class PetrolEngine:Engine{
    override fun start(){
        println("Petrol Engine Started")
    }
}

class ElectricEngine:Engine{
    override fun start(){
        println("Electric Engine Started")
    }
}

//without Class Delegation
//class Van:Engine{
//    private val engine=PetrolEngine()  //coupling
//    override fun start(){
//        engine.start()
//        println("Van Engine Started")
//        }
//
//}

//with class delegation

class Van(engine:Engine):Engine by engine{
    private val delegate= engine
    override fun start(){
        delegate.start()
        println("Van Engine Started")
    }
}

fun main(){
    val van1= Van(PetrolEngine())
    van1.start()
    val van2= Van(ElectricEngine())
    van2.start()

}