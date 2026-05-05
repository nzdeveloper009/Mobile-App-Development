package com.example.gullfatimalearnkotlin


interface notificatioN{
    fun send(message:String)
}

class EmailNotificatioN : notificatioN{
    override fun send(message:String) {
        println("Email sent")
    }
}

class SmsNotificatioN : notificatioN{
    override fun send(message:String) {
        println("SMS sent")
    }
}


class WhatsAppNotificatioN : notificatioN{
    override fun send(message: String) {
        println("WhatsApp sent: $message")
    }
}

object NotificationFactory {
    fun create(type: String): notificatioN {

        return when (type) {

            "email" -> EmailNotificatioN()

            "sms" -> SmsNotificatioN()

            "whatsapp" -> WhatsAppNotificatioN()  // factory decides
            else -> throw IllegalArgumentException("Invalid notification type")

        }

    }

}

fun main(){
    val n1 = NotificationFactory.create("email")
    n1.send("Your order has been placed!")

    val n2 = NotificationFactory.create("sms")
    n2.send("Your OTP is 4829")

    val n3 = NotificationFactory.create("whatsapp")
    n3.send("50% off today only! ")

}