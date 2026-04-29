package com.example.gullfatimalearnkotlin


//Invariance: By default
//open class Payment
//
//class CardPayment(val cardNumber:String):Payment()
//class JazzCashPayment(val amount:Int):Payment()
//
//class PMethod<T>(val data:T){
//
//}


//out: Covariance
//open class Payment
//class CardPayment(val cardNumber:String):Payment()
//class JazzCashPayment(val amount:Int):Payment()
//class PMethod< out T>(val data:T)

//In: Contravariance
open class Payment

class CardPayment(val cardNumber:String):Payment()
class JazzCashPayment(val amount:Int):Payment()

class PMethod< in T>{
    fun process(payment: T) {
        println("Processing $payment")
    }
}

fun main(){
   // val cardPayment:PMethod<CardPayment> = PMethod(CardPayment("1234"))
  //  val Payment:PMethod<Payment> =cardPayment;
    val generalProcessor: PMethod<Payment> =
        PMethod<Payment>()

    val cardProcessor: PMethod<CardPayment> =
        generalProcessor
    //in does not care about time because it's a consumer

}