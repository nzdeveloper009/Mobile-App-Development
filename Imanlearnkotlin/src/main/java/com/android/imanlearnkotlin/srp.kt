package com.android.imanlearnkotlin
class OrderService {
    fun takeOrder(food: String) {
        println("Order taken: $food")
    }
}
class KitchenService {
    fun cookFood(food: String) {
        println("Cooking: $food")
    }
}

class BillingService {
    fun generateBill(food: String) {
        println("Bill generated for: $food")
    }
}
fun main() {
    val order = OrderService()
    val kitchen = KitchenService()
    val bill = BillingService()
    val food = "Burger"
    order.takeOrder(food)
    kitchen.cookFood(food)
    bill.generateBill(food)
}
