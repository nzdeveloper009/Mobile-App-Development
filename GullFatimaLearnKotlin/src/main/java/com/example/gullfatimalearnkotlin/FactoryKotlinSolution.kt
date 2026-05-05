package com.example.gullfatimalearnkotlin

//sealed class =only these 3 types exist
sealed class Notification2{
    abstract fun send(message: String)

    // All types defined right inside — no separate files needed
    class Email     : Notification2() { override fun send(m:String) = println("$m") }

    class Sms       : Notification2() { override fun send(m:String) = println("$m") }

    class WhatsApp  : Notification2() { override fun send(m:String) = println("$m") }


    // companion object =factor INSIDE the sealed class
    companion object {
        fun create(type: String): Notification2 = when (type) {

            "email"    -> Email()

            "sms"      -> Sms()

            "whatsapp" -> WhatsApp()

            else       -> throw IllegalArgumentException("Unknown: $type")

        }

    }
}

//clean code
fun main() {
    Notification2.create("email").send("Order confirmed!")
    Notification2.create("sms").send("OTP: 9271")
}
