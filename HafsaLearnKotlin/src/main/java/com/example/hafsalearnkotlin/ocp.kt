package com.example.hafsalearnkotlin

//Calculate discounts for different types of customers

// Base abstraction: defines the contract
interface DiscountPolicy {
    fun calculateDiscount(amount: Double): Double
}

// Concrete implementation 1: Regular customer discount
class RegularCustomerDiscount : DiscountPolicy {
    override fun calculateDiscount(amount: Double): Double {
        return amount * 0.05 // 5% discount
    }
}

// Concrete implementation 2: Premium customer discount
class PremiumCustomerDiscount : DiscountPolicy {
    override fun calculateDiscount(amount: Double): Double {
        return amount * 0.15 // 15% discount
    }
}

// Concrete implementation 3: VIP customer discount
class VipCustomerDiscount : DiscountPolicy {
    override fun calculateDiscount(amount: Double): Double {
        return amount * 0.25 // 25% discount
    }
}

// Context class: uses DiscountPolicy without knowing details
class BillingSystem(private val discountPolicy: DiscountPolicy) {
    fun checkout(amount: Double): Double {
        val discount = discountPolicy.calculateDiscount(amount)
        val finalAmount = amount - discount
        println("Original: $amount, Discount: $discount, Final: $finalAmount")
        return finalAmount
    }
}

// Main function: demonstrates OCP
fun main() {
    val regularBilling = BillingSystem(RegularCustomerDiscount())
    regularBilling.checkout(1000.0)

    val premiumBilling = BillingSystem(PremiumCustomerDiscount())
    premiumBilling.checkout(1000.0)

    val vipBilling = BillingSystem(VipCustomerDiscount())
    vipBilling.checkout(1000.0)
}
