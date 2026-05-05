package com.example.gullfatimalearnkotlin


//usually we use it, simple
//data class LaptopNotification(
//    var title: String = "",
//    var message: String = "",
//    var icon: String = "ic_default",
//    var sound: Boolean = true,
//    var vibrate: Boolean = false,
//    var badgeCount: Int = 0,
//    var targetScreen: String = "HomeScreen"
//)
//
//fun main() {
// Using apply{}, go INSIDE the object and set fields
//    val notification = LaptopNotification().apply {
//        title = "New Message!"
//        message = "Ali sent a photo"
//        icon = "ic_message"
//        sound = true
//        vibrate = false
//        badgeCount = 3
//        targetScreen = "ChatScreen"
//    }
//   println(notification)
//
//}

//Kotlin Modern solution
data class NotificatioN(
    val title: String,
    val message: String,
    val icon: String,
    val sound: Boolean,
    val vibrate: Boolean,
    val badgeCount: Int,
    val targetScreen: String
)


class NotificationBuilder {
    var title: String = ""
    var message: String = ""
    var icon: String = "ic_default"
    var sound: Boolean = true
    var vibrate: Boolean = false
    var badgeCount: Int = 0
    var targetScreen: String = "HomeScreen"

    fun build(): NotificatioN {
        return NotificatioN(title, message, icon, sound, vibrate, badgeCount, targetScreen)
    }
}

//DSL function

fun notification(block: NotificationBuilder.() -> Unit): NotificatioN{
    val builder = NotificationBuilder()
    builder.block()
    return builder.build()
}

fun main() {


    val notification = notification {
        title = "New Message!"
        message = "Ali sent a photo"
        icon = "ic_message"
        sound = true
        vibrate = false
        badgeCount = 3
        targetScreen = "ChatScreen"
    }

    /* Step1: notification{} call howa
    * 2. Aik blank notificationbuilder bana
    * 3. Builder ne us blank ko fil kiya
    * 4. object create hogya*/

}



