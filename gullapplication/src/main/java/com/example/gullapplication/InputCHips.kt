package com.example.gullapplication

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.InputChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputChipExample() {

    var selected by remember {
        mutableStateOf(false)
    }
    Column(

        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally

    ) {


        InputChip(
            selected = selected,
            onClick = {
                selected = !selected
            },
            label = {
                Text("Kotlin")
            },
            trailingIcon = {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Remove"
                )
            }
        )
        InputChip(
            selected = selected,
            onClick = {
                selected = !selected
            },
            label = {
                Text("Python")
            },
            trailingIcon = {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Remove"
                )
            }
        )
    }
}
@Preview(showBackground = true)
@Composable
fun InputChipExamplePreview() {
    InputChipExample()
}