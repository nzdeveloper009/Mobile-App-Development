package com.example.gullfatimalearnkotlin


interface Notifi{
    fun setup()
    fun send(message: String) {
        println("Sending notification: $message")
    }

}
class EmailNotification : Notifi{
    override fun setup() {
        println("Email notification setup")
    }
    override fun send(message: String) {
        println("Sending email notification: $message")
    }
}

class SmsNotification : Notifi{
    override fun setup() {
        println("SMS notification setup")
    }
    override fun send(message: String) {
        println("Sending SMS notification: $message")
    }
}


class WhatsAppNotification : Notifi{
    override fun setup() {
        println("WhatsApp notification setup")
    }
    override fun send(message: String) {
        println("Sending WhatsApp notification: $message")
    }
}




fun main() {
    val message = "Hello, this is a notification message."
    println("Enter the type of notification (email, sms, whatsapp):")
    val type = readln()

    if (type == "email") {
        val n = EmailNotification()
        n.setup()
        n.send(message)
    } else if (type == "sms") {
        val n = SmsNotification()
        n.setup()
        n.send(message)
    } else if (type == "whatsapp") {
        val n = WhatsAppNotification()
        n.setup()
        n.send(message)
    }
}