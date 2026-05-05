package com.example.gullfatimalearnkotlin

interface Button    { fun render() }
interface TextField { fun render() }
interface Card      { fun render() }

class LightButton    : Button    { override fun render() = println("🔲 Light Button") }
class LightTextField : TextField { override fun render() = println("📝 Light TextField") }
class LightCard      : Card      { override fun render() = println("🃏 Light Card") }


class DarkButton    : Button    { override fun render() = println("⬛ Dark Button") }
class DarkTextField : TextField { override fun render() = println("🖊  Dark TextField") }
class DarkCard      : Card      { override fun render() = println("🌑 Dark Card") }

//Abstract Factory-> defines WHAT a UI factory can make
interface UIFactory {
    fun createButton():    Button
    fun createTextField(): TextField
    fun createCard():      Card
}

//Concrete Factories
class LightThemeFactory : UIFactory {
    override fun createButton()    = LightButton()

    override fun createTextField() = LightTextField()

    override fun createCard()      = LightCard()

}

class DarkThemeFactory : UIFactory {
    override fun createButton()    = DarkButton()

    override fun createTextField() = DarkTextField()

    override fun createCard()      = DarkCard()

}

//pass any factory, screen stays the same
fun buildScreen(factory: UIFactory) {
    //Screen does NOT know if it's Light or Dark,..factory handles it
    factory.createButton().render()
    factory.createTextField().render()
    factory.createCard().render()
}

fun main() {
    println("--- User selected Light Theme ---")
    buildScreen(LightThemeFactory())

    println("--- User selected Dark Theme ---")
    buildScreen(DarkThemeFactory())
}