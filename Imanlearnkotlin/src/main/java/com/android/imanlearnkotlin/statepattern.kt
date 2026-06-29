package com.android.imanlearnkotlin
interface ATMState {
    fun insertCard(atm: ATM)
    fun withdrawMoney(atm: ATM)
}
class NoCardState : ATMState {

    override fun insertCard(atm: ATM) {
        println("Card Inserted")
        atm.setState(CardInsertedState())
    }

    override fun withdrawMoney(atm: ATM) {
        println("Insert card first")
    }
}
class CardInsertedState : ATMState {

    override fun insertCard(atm: ATM) {
        println("Card already inserted")
    }

    override fun withdrawMoney(atm: ATM) {
        println("Cash Dispensed")
        atm.setState(NoCardState())
    }
}
class ATM(private var state: ATMState) {

    fun setState(state: ATMState) {
        this.state = state
    }

    fun insertCard() {
        state.insertCard(this)
    }

    fun withdrawMoney() {
        state.withdrawMoney(this)
    }
}
fun main() {

    val atm = ATM(NoCardState())

    atm.withdrawMoney()

    atm.insertCard()

    atm.withdrawMoney()

    atm.withdrawMoney()
}