package com.example.hafsalearnkotlin
//Star-pattern presentation of my name using nested for-loops
fun main(){
    var rows=5
    var cols=5
    for(i in 1..5){
        for(j in 1..5){
            if(i===3 || j==1 || j==5){
                print("*")}else print(" ")}
            print("  ")
        for(j in 1..5){
            if((i==1&&j in 2..4)||(i==3)||(j==1&&i>1)||(j==5&&i>1)){
                print("*")} else print(" ")
        }
        print("  ")
        for(j in 1..5){
            if((i==1)||(i==3)||(j==1)){
                print("*")} else print(" ")
        }
        print("  ")
        for(j in 1..5){
            if((i==1)||(i==3)||(i==5) ||(j==1 && i<3)||(j==5 && i>3)){
                print("*")} else print(" ")
        }
        print("  ")
        for(j in 1..5){
            if((i==1&&j in 2..4)||(i==3)||(j==1&&i>1)||(j==5&&i>1)){
                print("*")} else print(" ")
        }
        println()
    }
}