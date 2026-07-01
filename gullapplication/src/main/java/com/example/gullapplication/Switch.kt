package com.example.gullapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SwitchColorExample() {

    var checked by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Switch(
            checked = checked,
            onCheckedChange = {
                checked = it
            },
            colors = SwitchDefaults.colors(

                //ON state
                checkedThumbColor = Color.White,
                checkedTrackColor = Color(0xFF8B5CF6),

                //OFF state
                uncheckedThumbColor = Color.White,
                uncheckedTrackColor = Color.LightGray

            )
        )

        Text(
            text = if (checked) "ON" else "OFF"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSwitchColor() {
    SwitchColorExample()
}