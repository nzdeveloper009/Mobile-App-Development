package com.example.haiderlearnkotlin


class LightBulb_Wrong {
    fun turnOn() = println("💡 Light Bulb is ON")
    fun turnOff() = println("💡 Light Bulb is OFF")
}

class Switch_Wrong {

    private val bulb = LightBulb_Wrong()

    fun on() = bulb.turnOn()
    fun off() = bulb.turnOff()
}




interface Switchable {
    fun turnOn()
    fun turnOff()
}

// Device 1
class LightBulb : Switchable {
    override fun turnOn() = println("💡 Light Bulb is ON")
    override fun turnOff() = println("💡 Light Bulb is OFF")
}

// Device 2
class Fan : Switchable {
    override fun turnOn() = println("🌀 Fan is ON")
    override fun turnOff() = println("🌀 Fan is OFF")
}


class AirConditioner : Switchable {
    override fun turnOn() = println("❄️ AC is ON")
    override fun turnOff() = println("❄️ AC is OFF")
}


class Switch(private val device: Switchable) {
    fun on() = device.turnOn()
    fun off() = device.turnOff()
}


fun main() {
    println("=== Dependency Inversion Principle ===\n")

    println("--- Controlling the Light Bulb ---")
    val bulbSwitch = Switch(LightBulb())
    bulbSwitch.on()
    bulbSwitch.off()

    println("\n--- Controlling the Fan ---")
    val fanSwitch = Switch(Fan())
    fanSwitch.on()
    fanSwitch.off()

    println("\n--- Controlling the AC ---")
    val acSwitch = Switch(AirConditioner())
    acSwitch.on()
    acSwitch.off()


}



