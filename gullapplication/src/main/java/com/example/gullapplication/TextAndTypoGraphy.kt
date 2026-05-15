package com.example.gullapplication

import android.graphics.fonts.FontStyle
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SimpleText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text="Hello Everyone",
            color = Color.Blue,
            fontSize = 30.sp,
            fontWeight= FontWeight.Bold,
            style = TextStyle(
                shadow= Shadow(color = Color.Black, blurRadius = 20f)
                )


        )
    }
}


@Composable
fun Colorful() {
    val rainbowColors = listOf(
        Color.Blue,
        Color.Red,
        Color.Magenta,
        Color.Gray,
        Color.Cyan,
        Color.Yellow,
        Color.Green

    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = buildAnnotatedString {
                append("Do not allow people to ruin your peace")
                withStyle(
                    SpanStyle(
                        brush = linearGradient(
                            colors = rainbowColors
                        ),
                        fontSize = 30.sp,
                    )
                ) {
                    append("\nBecause they have pain")
                }
                append("\n Do not allow people to ruin your peace")
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SimpleTextPreview(){
    //SimpleText()
    Colorful()
}
