package com.example.gullapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AccessString(){
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter
    ){
        Text(text = stringResource(id = R.string.Welcome), color=colorResource(R.color.orange))
          }
}

@Composable
fun AccessImage()
{
    Box(
        modifier= Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ){
        Image(painter= painterResource(R.drawable.barca), contentDescription = "Messi Image")
    }
}

@Preview(showBackground = true)
@Composable
fun ResourcePreview(){
    //AccessString()
    AccessImage()
    AccessString()
}

