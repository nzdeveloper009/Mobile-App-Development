package com.example.gullapplication

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

//Filled Buttonn
@Composable
fun FilledButtonSample() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Button(
                onClick = {
                    Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()

                    //Temporary notification at the bottom
                }
            ) {
                Text(text = "Filled Button")
            }

            //TonelButon
            FilledTonalButton(
                onClick = {
                    Toast.makeText(context, "Filled Tonal Button is clicked", Toast.LENGTH_SHORT)
                        .show()
                }
            ) {
                Text(text = "Filled Tonal Button")
            }

            //Outlined Button
            //secondary button-> less focus required
            OutlinedButton(
                onClick = {
                    Toast.makeText(context, "Outlined Button is clicked", Toast.LENGTH_SHORT)
                        .show()
                }
            ) {
                Text(text = "Outlined Button")
            }

            //Elevated Button: surface se thora upar
            ElevatedButton(
                onClick = {

                }
            ) {
                Text(text = "Elevated Button")
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun FilledButtonSamplePreview()
{
    FilledButtonSample()
}
