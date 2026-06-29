package com.example.gullapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun CircleProgressExample() {
    // 1. Create a state variable to track if loading is active
    var isDownloading by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // 2. Only show the button if NOT downloading
        if (!isDownloading) {
            Button(
                onClick = {
                    // 3. Update state to trigger recomposition
                    isDownloading = true
                }
            ) {
                Text("Download File")
            }
        } else {
            // 4. Show the indicator when isDownloading is true
            CircularProgressIndicator()
        }
    }
}

@Composable
fun ProgressExample() {

    var progress by remember {

        mutableStateOf(0f)

    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(

            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            LinearProgressIndicator(

                progress = {

                    progress

                }

            )

            Button(

                onClick = {

                    if (progress < 1f) {

                        progress += 0.1f

                    }

                }

            ) {

                Text("Increase")

            }

        }

    }
}
