package com.android.imanlearnkotlin

fun main() {

    val d = Dress()

    // Default setter
    d.type = "Formal"

    // Custom setter
    d.price = 3000

    // Default getter
    println("Type: ${d.type}")

    // Custom getter
    println("Price: ${d.price}")
}
class Dres {
    // Default getter & setter
    var type: String = "Casual"

    // Custom getter & setter
    var price: Int = 0
        get() {
            println("Getter called")
            return field
        }
        set(value) {
            println("Setter called")
            if (value >= 0) {
                field = value
            } else {
                println("Invalid price")
            }
        }
}

