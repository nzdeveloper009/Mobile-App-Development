package com.example.gullapplication

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(color= Color.Yellow),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
     Text("This is Home Screen",
         fontSize = 30.sp)
        Spacer(Modifier.height(25.dp))
        Button(
            onClick ={
             navController.navigate(Routes.WishList)
            }
        ){
            Text("Go to wishList")
        }
    }
}