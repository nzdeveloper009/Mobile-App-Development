package com.example.gullapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyScreen() {

    Scaffold(

        floatingActionButton = {

            FloatingActionButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }

        }

    ) { padding ->

        Text(
            text = "Hello",
            modifier = Modifier.padding(padding)
        )

    }
}