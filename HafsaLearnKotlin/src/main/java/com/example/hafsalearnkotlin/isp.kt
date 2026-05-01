package com.example.hafsalearnkotlin

//Payment System

// violates ISP:
// One big interface forces all payment methods to implement features they may not support.
interface PaymentProcessor {
    fun pay(amount: Double)
    fun refund(amount: Double)
    fun saveCardDetails(cardNumber: String)
    fun generateInvoice()
}

// Good design (follows ISP):
// Split into smaller, role-specific interfaces.
interface Payable {
    fun pay(amount: Double)
}

interface Refundable {
    fun refund(amount: Double)
}

interface CardSavable {
    fun saveCardDetails(cardNumber: String)
}

interface Invoicable {
    fun generateInvoice()
}

// Now classes can implement only what they need:

// Example: PayPal supports payments and refunds, but doesn’t save card details directly
class PayPalProcessor : Payable, Refundable {
    override fun pay(amount: Double) {
        println("PayPal processed payment of $$amount")
    }

    override fun refund(amount: Double) {
        println("PayPal refunded $$amount")
    }
}

// Example: Credit Card processor supports payments and saving card details
class CreditCardProcessor : Payable, CardSavable {
    override fun pay(amount: Double) {
        println("Credit Card charged $$amount")
    }

    override fun saveCardDetails(cardNumber: String) {
        println("Card details saved securely: $cardNumber")
    }
}

// Example: Invoice system only generates invoices
class InvoiceSystem : Invoicable {
    override fun generateInvoice() {
        println("Invoice generated and sent to customer.")
    }
}

// Demonstration
fun main() {
    val paypal: Payable = PayPalProcessor()
    paypal.pay(100.0)

    val creditCard: CreditCardProcessor = CreditCardProcessor()
    creditCard.pay(250.0)
    creditCard.saveCardDetails("1234-5678-9012-3456")

    val invoiceSystem: Invoicable = InvoiceSystem()
    invoiceSystem.generateInvoice()
}
