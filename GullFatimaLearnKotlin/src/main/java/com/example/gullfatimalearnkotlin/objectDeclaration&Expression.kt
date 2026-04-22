package com.example.gullfatimalearnkotlin

fun main() {
    checkLogin()
    //object expression
    var buttonClick=object{
        fun onClick()
        {
            println("Button Clicked")
        }

    }
    buttonClick.onClick()

}
object currentUser{
    var name:String=""
    var isLoggedIn:Boolean=false
}
fun login()
{
    currentUser.name="Gull"
    currentUser.isLoggedIn=true
}
fun logout()
{
    currentUser.name=""
    currentUser.isLoggedIn=false

}
fun checkLogin()
{
    if(currentUser.isLoggedIn)
    {
        println("User is logged in")
    }
    else
    {
        println("User is not logged in")
    }

}

