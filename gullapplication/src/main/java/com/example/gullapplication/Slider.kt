package com.example.gullapplication


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SliderExample() {

    var sliderValue by remember {
        mutableStateOf(0f)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Value: %.2f".format(sliderValue)
        )

        Slider(
            value = sliderValue,
            onValueChange = {
                sliderValue = it
            }
        )

    }
}

@Preview(showBackground = true)
@Composable
fun SliderPreview() {
    SliderExample()
}