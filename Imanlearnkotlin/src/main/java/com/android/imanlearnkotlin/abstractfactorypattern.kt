package com.android.imanlearnkotlin

interface Chhair {
    fun sit()
}

interface Sofa {
    fun lie()
}
class ModernChair : Chhair {
    override fun sit() {
        println("Modern Chair")
    }
}

class ModernSofa : Sofa {
    override fun lie() {
        println("Modern Sofa")
    }
}
interface FurnitureFactory {

    fun createChair(): Chhair

    fun createSofa(): Sofa
}
class ModernFactory : FurnitureFactory {

    override fun createChair(): Chhair {
        return ModernChair()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }
}
fun main() {

    val factory = ModernFactory()

    val chhair = factory.createChair()
    val sofa = factory.createSofa()

    chhair.sit()
    sofa.lie()
}
