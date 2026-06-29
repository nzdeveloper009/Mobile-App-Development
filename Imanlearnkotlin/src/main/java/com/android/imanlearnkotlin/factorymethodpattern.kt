package com.android.imanlearnkotlin

interface Transport {
    fun deliver()
}
class Truck : Transport {
    override fun deliver() {
        println("Delivering by Truck")
    }
}

class Ship : Transport {
    override fun deliver() {
        println("Delivering by Ship")
    }
}
abstract class Logistics {

    abstract fun createTransport(): Transport

    fun deliverProduct() {
        val transport = createTransport()
        transport.deliver()
    }
}
class RoadLogistics : Logistics() {
    override fun createTransport(): Transport {
        return Truck()
    }
}

class SeaLogistics : Logistics() {
    override fun createTransport(): Transport {
        return Ship()
    }
}
fun main() {
    val logistics: Logistics = RoadLogistics()
    logistics.deliverProduct()
}