package com.android.imanlearnkotlin

interface StudyMaterial {
    fun study()
}
class Book : StudyMaterial {
    override fun study() {
        println("Studying from Book")
    }
}
class Notes : StudyMaterial {
    override fun study() {
        println("Studying from Notes")
    }
}
class OnlineVideo : StudyMaterial {
    override fun study() {
        println("Studying from Online Video")
    }
}
class Studentt(private val material: StudyMaterial) {

    fun startStudy() {
        material.study()
    }
}
fun main() {

    val student1 = Studentt(Book())
    student1.startStudy()
    val student2 = Studentt(Notes())
    student2.startStudy()
    val student3 = Studentt(OnlineVideo())
    student3.startStudy()
}
