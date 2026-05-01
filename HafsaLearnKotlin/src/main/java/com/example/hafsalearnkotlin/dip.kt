package com.example.hafsalearnkotlin

// Dependency Inversion Principle(DIP)

// Abstraction: defines a contract for payment services
// Both high-level and low-level modules depend on this abstraction
interface PaymentService {
    fun processPayment(amount: Double)
}

// Low-level module: CreditCardPayment implements the abstraction
// Details depend on abstraction, not the other way around
class CreditCardPayment : PaymentService {
    override fun processPayment(amount: Double) {
        println("Processing credit card payment of $$amount")
    }
}

// Low-level module: PayPalPayment implements the abstraction
// Another detail depending on abstraction
class PayPalPayment : PaymentService {
    override fun processPayment(amount: Double) {
        println("Processing PayPal payment of $$amount")
    }
}

// High-level module: Checkout depends only on abstraction (PaymentService)
//  It does NOT depend on concrete classes like CreditCardPayment or PayPalPayment
class Checkout(private val paymentService: PaymentService) {
    fun completeOrder(amount: Double) {
        println("Starting checkout...")
        paymentService.processPayment(amount) // Delegates to whichever implementation is injected
        println("Order completed successfully!")
    }
}
fun main() {
    // Injecting CreditCardPayment into Checkout
    val creditCardCheckout = Checkout(CreditCardPayment())
    creditCardCheckout.completeOrder(150.0)

    // Injecting PayPalPayment into Checkout
    val paypalCheckout = Checkout(PayPalPayment())
    paypalCheckout.completeOrder(200.0)
}
