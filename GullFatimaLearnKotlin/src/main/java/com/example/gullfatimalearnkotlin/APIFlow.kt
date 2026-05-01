package com.example.gullfatimalearnkotlin


import kotlin.properties.Delegates
import org.json.JSONObject

class MobileUser(val name: String) {
    fun update(temp: Int) {
        println("$name got temp update: $temp°C")
    }
}

fun main() {
    val userList = mutableListOf<MobileUser>()
    userList.add(MobileUser("Gull"))
    userList.add(MobileUser("Amal"))

    // Delegate — jab bhi temperature change ho, auto notify
    var temperature: Int by Delegates.observable(0) { _, old, new ->
        println("🔄 Temperature changed: $old°C → $new°C")
        for (user in userList) {
            user.update(new)
        }
    }

    // API se data fetch karo
    println("📡 API se temperature fetch ho raha hai...")
    val fakeJson = """{"city": "Lahore", "temperature": 38}"""
    val apiTemp = JSONObject(fakeJson).getInt("temperature")

    // Bas value assign karo — delegate khud notify kar dega!
    temperature = apiTemp
}