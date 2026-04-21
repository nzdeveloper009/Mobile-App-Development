package com.android.imanlearnkotlin
fun main() {
    val d = Dispensary()
    d.showInfo()
    d.locationInfo()
    val doc = Doctor()
    doc.doctorAccess()
}
open class Dispensary {

    public var name = "City Dispensary"     // public
    private var password = "1234"           // private
    protected var doctorSalary = 80000      // protected
    internal var location = "Gujrat"       // internal
    public fun showInfo() {
        println("Dispensary: $name")
    }
    private fun secretCode() {
        println("Password: $password")
    }
    protected fun salaryInfo() {
        println("Doctor Salary: $doctorSalary")
    }
    internal fun locationInfo() {
        println("Location: $location")
    }
}
class Doctor : Dispensary() {
    fun doctorAccess() {
        println(name)
        println(doctorSalary)
        println(location)
        showInfo()
        salaryInfo()
        locationInfo()
    }
}
