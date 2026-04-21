package com.android.imanlearnkotlin

fun main() {
    val c1: Cat = PersianCat()
    val c2: Cat = StreetCat()

    c1.name = "Fluffy"
    c2.name = "Sheru"

    c1.showInfo()
    c2.showInfo()
}


open class Cat {
    var name: String = "Unknown"

    open fun showInfo() {
        println("Cat name: $name")
    }
}
class PersianCat : Cat() {
    override fun showInfo() {
        println("Persian Cat name: $name")
    }
}
class StreetCat : Cat() {
    override fun showInfo() {
        println("Street Cat name: $name")
    }
}