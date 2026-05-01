package com.example.gullfatimalearnkotlin
import kotlin.properties.Delegates

class PhoneUser(val name:String){
    fun update(temp:Int){
        println("$name got temp update: $temp")
    }
}

fun main(){
    val u1=PhoneUser("Gull")
    val u2=PhoneUser("Amal")
    val userList= mutableListOf<PhoneUser>()
    userList.add(u1)
    userList.add(u2)
    var temperature: Int by Delegates.observable(20){_,old,new->
        for(user in userList){
            user.update(new)
        }
    }
    temperature=35;
}