package com.example.gullapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BadgeExample(){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        BadgedBox(
            badge ={
                Badge {
                    Text("99+")
                }
        }
        )
        {
           Icon(
               imageVector = Icons.Default.Notifications,
               contentDescription = "Notifications"
           )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BadgeExamplePreview(){
    BadgeExample()
}