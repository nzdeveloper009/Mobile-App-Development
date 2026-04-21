package com.example.gullfatimalearnkotlin

//without OCP:
//class Notification(val type:String, val email:String, val phoneNumber:String){
//     fun sendNotification(){
//        if(type=="email"){
//            println("Email sent to $email")
//        }
//        else if(type=="whatsapp"){
//            println("WhatsApp sent to $phoneNumber")
//        }
//    }
//}
//fun main()
//{
//    val email = Notification("email","gullfatimah.....com","")
//    email.sendNotification()
//    val whatsapp = Notification("whatsapp","","0329000000")
//    whatsapp.sendNotification()
//    //now if i wanna add sms or another functionality, I have to change the class(existing code).
//}

interface Notification{
    fun sendNotification()
}

class Email(val email:String):Notification{
    override fun sendNotification() {
        println("Email sent to $email")
    }
}

class WhatsappNotification(val phoneNumber:String):Notification {
    override fun sendNotification() {
        println("Whatsapp sent to $phoneNumber")
    }
}


fun main()
{
    val email = Email("gullfatimah.....com")
    email.sendNotification()
    val whatsapp = WhatsappNotification("0329000000")
    whatsapp.sendNotification()

}








