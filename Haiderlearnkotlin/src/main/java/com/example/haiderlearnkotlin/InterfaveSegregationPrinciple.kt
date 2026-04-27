package com.example.haiderlearnkotlin


interface Machine_Wrong {
    fun print()
    fun scan()
    fun fax()
}

class BasicPrinter_Wrong : Machine_Wrong {
    override fun print() = println("Printing...")
    override fun scan() = println("Scanning...")
    override fun fax() = throw UnsupportedOperationException("I can't fax! 💥")
}



interface Printable {
    fun print()
}

interface Scannable {
    fun scan()
}

interface Faxable {
    fun fax()
}


class BasicPrinter : Printable {
    override fun print() = println("🖨️ Basic Printer: Printing document...")
}


class OfficePrinter : Printable, Scannable {
    override fun print() = println("🖨️ Office Printer: Printing document...")
    override fun scan() = println("📠 Office Printer: Scanning document...")
}


class AllInOnePrinter : Printable, Scannable, Faxable {
    override fun print() = println("🖨️ All-in-One: Printing document...")
    override fun scan() = println("📠 All-in-One: Scanning document...")
    override fun fax() = println("📡 All-in-One: Sending fax...")
}


fun main() {
    println("=== Interface Segregation Principle ===\n")

    val basic = BasicPrinter()
    val office = OfficePrinter()
    val allInOne = AllInOnePrinter()

    println("--- Basic Printer ---")
    basic.print()

    println("\n--- Office Printer ---")
    office.print()
    office.scan()

    println("\n--- All-in-One Printer ---")
    allInOne.print()
    allInOne.scan()
    allInOne.fax()


}

