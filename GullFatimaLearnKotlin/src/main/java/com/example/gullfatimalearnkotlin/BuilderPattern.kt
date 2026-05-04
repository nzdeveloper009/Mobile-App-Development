package com.example.gullfatimalearnkotlin

// Constructor with too many parameters — NIGHTMARE
//class AppNotification(
//    val title: String,
//    val message: String,
//    val icon: String,
//    val sound: Boolean,
//    val vibrate: Boolean,
//    val badgeCount: Int,
//    val targetScreen: String
//)
//
//what true/false means here?
//More fields does not mean all are required in all cases
//val n = AppNotification("Hello", "You got a message", "ic_msg", true, false, 1, "ChatScreen")
//


//Step 1:Traditional Builder

class AppNotification private constructor(
    val title: String,
    val message: String,
    val icon: String,
    val sound: Boolean,
    val vibrate: Boolean,
    val badgeCount: Int,
    val targetScreen: String
) //here some fields are necessary for notification
{

    // Nested Builder class
    class Builder(
        private val title: String,     //REQUIRED
        private val message: String    //REQUIRED
    ) {
        //Optional fields with defaults
        private var icon: String = "ic_default"
        private var sound: Boolean = true
        private var vibrate: Boolean = false
        private var badgeCount: Int = 0
        private var targetScreen: String = "HomeScreen"

        fun icon(icon: String): Builder {
            this.icon = icon
            return this
        }

        fun sound(sound: Boolean): Builder {
            this.sound = sound
            return this
        }

        fun vibrate(vibrate: Boolean): Builder {
            this.vibrate = vibrate
            return this
        }

        fun badgeCount(count: Int): Builder {
            this.badgeCount = count
            return this
        }

        fun targetScreen(screen: String): Builder {
            this.targetScreen = screen
            return this
        }

        fun build(): AppNotification {
            return AppNotification(
                title, message, icon,
                sound, vibrate, badgeCount, targetScreen
            )
        }
    }
    fun display(){
        println("Notification Displayed")
        println("Title: $title")
        println("Message: $message")
        println("Icon: $icon")
        println("Sound: $sound")
        println("Vibrate: $vibrate")
        println("Badge Count: $badgeCount")
    }
}
fun main(){
    val notification = AppNotification.Builder("Hello", "You got a message")
        .icon("ic_msg")
        .badgeCount(1)

    notification.build().display()
}


