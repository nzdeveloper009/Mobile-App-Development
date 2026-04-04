package com.example.gullfatimalearnkotlin

open class BankAccount
{
    public var accountHolder= "Gull Fatima"

    private var balance = 5000

    protected fun showBalance()
    {
        println("Balance is:$balance")
    }

    public fun deposit(amount: Int)
    {
        balance += amount
        println("Amount deposited")
    }
}

class SavingsAccount : BankAccount()
{
    fun checkAccount() {
        println("Account holder: $accountHolder")
        //println("Balance: $balance")//balance is private cant be accessed in child class
        showBalance() //protected member accessible in child class
    }
}

fun main() {

    val acc = SavingsAccount()

    println(acc.accountHolder)   //public
    acc.deposit(1000)            //public
    acc.checkAccount()

}