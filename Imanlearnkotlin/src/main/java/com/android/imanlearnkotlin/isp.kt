package com.android.imanlearnkotlin
interface Printer {
    fun print()
}

interface Scanner {
    fun scan()
}
interface Fax {
    fun fax()
}
class BasicPrinter : Printer {
    override fun print() {
        println("Basic Printer: Printing document")
    }
}
class AdvancedPrinter : Printer, Scanner, Fax {
    override fun print() {
        println("Advanced Printer: Printing document")
    }

    override fun scan() {
        println("Advanced Printer: Scanning document")
    }

    override fun fax() {
        println("Advanced Printer: Sending fax")
    }
}
fun main() {

    val basic = BasicPrinter()
    basic.print()
    val advanced = AdvancedPrinter()
    advanced.print()
    advanced.scan()
    advanced.fax()
}