package com.example.gullfatimalearnkotlin

//classical way Strategy Interface
//interface Validator {
//    fun isValid(value: String): Boolean
//}
//
//// Concrete Strategies
//class EmailValidator : Validator {
//    override fun isValid(value: String) = value.contains("@")
//}
//
//class PhoneValidator : Validator {
//    override fun isValid(value: String) = value.length == 10
//}
//
//// Context Class
//class FormField(val name: String, val validator: Validator) {
//    fun validate(value: String) = validator.isValid(value)
//}
//
//fun main(){
//    val emailField = FormField("abc123@gmail.com", EmailValidator())
//    val phoneField = FormField("03338486171", PhoneValidator())
//}


//Modern Kotlin Way

//Type Alias for cleaner code
typealias ValidationStrategy = (String) -> Boolean

class FormField(val name: String, val validation: ValidationStrategy)

fun main() {
    val emailField = FormField("Email") { it.contains("@") } //function creating in form field

    val passwordField = FormField("Password") { it.length >= 8 }
    println(emailField.validation("abc123@gmail.com"))
    println(passwordField.validation("123478"))
}