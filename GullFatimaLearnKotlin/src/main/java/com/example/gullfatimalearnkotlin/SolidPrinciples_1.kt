package com.example.gullfatimalearnkotlin

// Using inheritance
//open class Payment{
//    open fun pay(){
//        println("Processing payment")
//    }
//}
//
//class CreditCard : Payment(){
//    override fun pay(){
//        println("Paid using Credit Card")
//    }
//}
//
//class JazzCash : Payment(){
//    override fun pay(){
//        println("Paid using JazzCash")
//    }
//}
//
//class PayPal : Payment(){
//    override fun pay(){
//        println("Paid using PayPal")
//    }
//}
//
//class Checkout{
//    private val payment = CreditCard()  //now payment has restricted to credit card method only
//
//    fun process(){
//        payment.pay()
//    }
//}
//fun main()
//{
//    val ch1=Checkout()
//    ch1.process()
//}


//solution:
interface PaymentMethod{
    fun methodDisplay()
}

class CreditCard:PaymentMethod{
    override fun methodDisplay(){
        println("Credit Card")
    }
}

class JazzCash: PaymentMethod{
    override fun methodDisplay(){
        println("JazzCash")
    }
}

class PayPal: PaymentMethod{
    override fun methodDisplay(){
        println("PayPal")
    }
}

class Checkout(private val method: PaymentMethod){
    fun display()
    {
        method.methodDisplay()
    }
}
fun main()
{
    val ch1=Checkout(CreditCard())
    ch1.display()
    val ch2=Checkout(JazzCash())
    ch2.display()
    val ch3=Checkout(PayPal())
    ch3.display()

}


