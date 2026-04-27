package com.example.haiderlearnkotlin


/ WRONG
fun getDiscount_Wrong(customerType: String): Double {
    return when (customerType) {
        "Regular" -> 0.0
        "Member" -> 10.0
        "VIP" -> 20.0
        else -> 0.0
    }
}



interface Discount {
    fun getDiscount(): Double
}

class RegularDiscount : Discount {
    override fun getDiscount() = 0.0
}

class MemberDiscount : Discount {
    override fun getDiscount() = 10.0
}

class VIPDiscount : Discount {
    override fun getDiscount() = 20.0
}


class StudentDiscount : Discount {
    override fun getDiscount() = 15.0
}

fun printDiscount(discount: Discount) {
    println("Your discount is: ${discount.getDiscount()}%")
}


fun main() {
    println("=== Open / Closed Principle ===\n")

    printDiscount(RegularDiscount())
    printDiscount(MemberDiscount())
    printDiscount(VIPDiscount())
    printDiscount(StudentDiscount())

    // added StudentDiscount without editing ANY existing code
}





