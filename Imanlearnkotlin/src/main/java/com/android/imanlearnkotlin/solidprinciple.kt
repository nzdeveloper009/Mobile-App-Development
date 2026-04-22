package com.android.imanlearnkotlin

fun main() {
    val sms: Message = SMS()
    val email: Message = Email()

    sms.send()
    email.send()
}
interface Message {
    fun send()
}
class SMS : Message {
    override fun send() {
        println("Sending SMS")
    }
}
class Email : Message {
    override fun send() {
        println("Sending Email")
    }
}

