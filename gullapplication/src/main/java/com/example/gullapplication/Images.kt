package com.example.gullapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ImageShow(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
    val rainbowColor = listOf(
        Color.Blue,
        Color.Red,
        Color.Magenta,
        Color.Gray,
        Color.Cyan,
        Color.Yellow,
        Color.Green

    )
 val borderWidth =4.dp

        Image(
            painter = painterResource(id = R.drawable.barca),
            contentDescription = "Messi Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(200.dp).clip(CircleShape).border(
                BorderStroke(borderWidth, Brush.linearGradient(rainbowColor)),
            ), //round image
            alignment = Alignment.Center,
            colorFilter = ColorFilter.colorMatrix(
                ColorMatrix().apply
            {
                setToSaturation(0f)
            }
            )
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ImagePreview(){
 ImageShow()
}

