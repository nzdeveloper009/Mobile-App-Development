package com.example.gullapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DialogueBox() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        var showDialog by remember {
            mutableStateOf(false)
        }
        Button(
            onClick = {
                showDialog = true
            },
            modifier = Modifier.align(Alignment.Center).size(200.dp, 50.dp)
        ) {
            Text("Delete", fontSize = 25.sp)
        }
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { },

                title = {
                    Text("Delete File")
                },

                text = {
                    Text("Are you Sure?")
                },
                confirmButton = {

                    Button(
                        onClick = {

                            println("Deleted")

                            showDialog = false
                        }
                    ) {
                        Text("Delete")
                    }
                },

                dismissButton = {
                    Button(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text("Cancel")
                    }
                }
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DialogueBoxPreview() {
    DialogueBox()
}