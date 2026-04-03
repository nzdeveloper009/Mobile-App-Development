package com.example.gullfatimalearnkotlin

fun main() {
    val name: String? = null
    name?.let {
        println(it.uppercase())
    }


    val user = User()
    user.namE = "Gull"
    user.age = 19
    println(user.namE)

    val user1 = User().apply {
        namE = "Amal"
        age = 20   //returns object
    }
    with(user1) {
        println(namE)
        println(age)
    }

    var r1 = rectanglee(23, 4)
    val res = r1.run {
        val area = width * height
        "Area of rectangle is $area"  //run returns last value
    }
    println(res)

}


class User{
    var namE=""
    var age=0

}

data class rectanglee(val width:Int,val height:Int)