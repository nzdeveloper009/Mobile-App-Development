package com.android.nokhaizlearnkotlin

class Dummy {
    private var mName = "Dummy"
    fun getName(): String = mName
    fun setName(name: String) {
        mName = name
    }
}

fun main() {
    val dummy = Dummy()
    println(dummy.getName())
    dummy.setName("Android")
    println(dummy.getName())
}