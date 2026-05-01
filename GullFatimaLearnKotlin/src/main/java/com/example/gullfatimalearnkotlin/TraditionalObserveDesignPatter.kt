package com.example.gullfatimalearnkotlin

interface Subscriber{
    fun update(title: String)
}


class YoutubeChannel{
    private val subscribers = mutableListOf<Subscriber>()
    //subscribers list


    //function for adding subscribers
    fun addSubscriber(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    //uploadingVideo main function: notifying all subscribers about new video
    fun uploadVideo(title: String){

        println("New video uploaded: $title")
        for (subscriber in subscribers) {
            subscriber.update(title)
        }
    }

}

class YoutubeUser(val name:String): Subscriber{
    override fun update(title: String) {
    }

}




//Example 2
interface oberver{
    fun update(title: String)
}

class WorkStation{
    private val observers = mutableListOf<oberver>()

    fun addObserver(ob:oberver){
        observers.add(ob)
    }

    fun removeObserver(ob:oberver) {
        observers.remove(ob)
    }
    fun tempUpdate(title: String){
        for(ob in observers){
            ob.update(title)
        }
    }
}

class MobileDisplay(val name: String): oberver{
    override fun update(title: String) {
        println("$name Display got temp update: $title")
    }
}
class DesktopDisplay(val name: String): oberver{
    override fun update(title: String) {
        println("$name Display got temp update: $title")
    }
}

class TvDisplay(val name:String): oberver {
    override fun update(title: String) {
        println("$name got temp update: $title")
    }
}




fun main() {
    val channel = YoutubeChannel()
    val user1 = YoutubeUser("Gull")
    val user2 = YoutubeUser("Fatima")
    channel.addSubscriber(user1)
    channel.addSubscriber(user2)
    channel.uploadVideo("Kotlin Tutorial")
    channel.uploadVideo("Java Tutorial")


    //Example Update
    val ws = WorkStation()
    val mobile = MobileDisplay("Samsung")
    val desktop = DesktopDisplay("Lenovo")
    val tv = TvDisplay("Orient")
    ws.addObserver(mobile)
    ws.addObserver(desktop)
    ws.addObserver(tv)
    ws.tempUpdate("35 Moderate")


}
