package com.example.gullfatimalearnkotlin
//class UseR {
//    var state: UserState = AnonymousState //Initial state
//
//    fun viewProfile() {
//        state.viewProfile(user=this) // State handle  kare ga
//    }
//}
//
//// . State Interface
//interface UserState {
//    fun viewProfile(user: UseR)
//}
//
//// States
//object AnonymousState : UserState {
//    override fun viewProfile(user: UseR) = println("Please login first!")
//}
//
//object AuthenticatedState : UserState {
//    override fun viewProfile(user: UseR) = println("Showing Profile Page...")
//}
//
//
//fun main()
//{
//    var user1=UseR()
//    user1.state;
//    user1.viewProfile()
//    var user2=UseR()
//    user2.state= AuthenticatedState;
//    user2.viewProfile()
//}

// uisng enum  method
//class User1(val name: String) {
//    var state: UserState = UserState.ANONYMOUS
//
//    fun performAction() {
//        //State ke variable function ko call karna
//        state.viewProfile(this)
//    }
//}
//
////Method 3: Enum version
//enum class UserState(
//    val viewProfile: (User1) -> Unit
//) {
//    ANONYMOUS(
//        viewProfile = { user -> println("Hey ${user.name}, please login to see your profile.") }
//    ),
//    AUTHENTICATED(
//        viewProfile = { user -> println("Welcome back, ${user.name}! Opening your dashboard...") }
//    )
//}
//
//
//fun main() {
//    val myUser = User1("Ali")
//
//    myUser.performAction()
//
//    myUser.state = UserState.AUTHENTICATED
//    myUser.performAction()
//}



//Moderen Function
class User2(val name: String) {
    var state: UserStateHero = UserStateHero.ANONYMOUS

    //Helper function
    fun showSimpleUI() = println("Displaying Basic UI for $name")

    fun triggerView() {
        // Calling the state behavior
        state.viewProfile(this)
    }
}

// Method 4: The Hero Version
enum class UserStateHero(
    val viewProfile: User2.() -> Unit // 'User.' means User is the receiver
) {
    ANONYMOUS({

        println("Status: Guest User")
        showSimpleUI()
    }),

    AUTHENTICATED({
        println("Status: Logged In")
        println("Accessing private data for: $name") // Direct access to 'name'
    })
}


fun main() {
    val heroUser = User2("Osama")

    heroUser.triggerView()

    println("--- Switching State ---")

    heroUser.state = UserStateHero.AUTHENTICATED
    heroUser.triggerView()
}