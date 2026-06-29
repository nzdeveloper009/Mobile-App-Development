package com.android.imanlearnkotlin

class Computer(
    val cpu: String,
    val ram: Int,
    val storage: Int,
    val graphicsCard: Boolean
)
class ComputerBuilder {

    private var cpu = ""
    private var ram = 0
    private var storage = 0
    private var graphicsCard = false

    fun setCPU(cpu: String): ComputerBuilder {
        this.cpu = cpu
        return this
    }

    fun setRAM(ram: Int): ComputerBuilder {
        this.ram = ram
        return this
    }

    fun setStorage(storage: Int): ComputerBuilder {
        this.storage = storage
        return this
    }

    fun setGraphicsCard(value: Boolean): ComputerBuilder {
        graphicsCard = value
        return this
    }

    fun build(): Computer {
        return Computer(cpu, ram, storage, graphicsCard)
    }
}
fun main() {

    val computer = ComputerBuilder()
        .setCPU("Intel i7")
        .setRAM(16)
        .setStorage(512)
        .setGraphicsCard(true)
        .build()

    println(computer.cpu)
    println(computer.ram)
    println(computer.storage)
    println(computer.graphicsCard)
}