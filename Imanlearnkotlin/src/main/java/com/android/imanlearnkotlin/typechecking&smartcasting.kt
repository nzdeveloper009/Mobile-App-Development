package com.android.imanlearnkotlin

fun main() {
    val bold: FontStyle = Bold()
    val italic: FontStyle = Italic()

    bold.applyStyle("Hello World")
    italic.applyStyle("Kotlin Programming")
}
interface FontStyle {
    fun applyStyle(text: String)
}

class Bold : FontStyle {
    override fun applyStyle(text: String) {
        println("**$text**")   // bold style
    }
}

class Italic : FontStyle {
    override fun applyStyle(text: String) {
        println("*$text*")   // italic style
    }
}