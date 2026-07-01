package com.example.gullapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerExample() {

    var showDialog by remember {
        mutableStateOf(false)
    }

    val datePickerState = rememberDatePickerState()

    Column(

        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center

    ) {

        Button(

            onClick = {

                showDialog = true

            }

        ) {

            Text("Select Date")

        }

    }

    if (showDialog) {

        DatePickerDialog(

            onDismissRequest = {

                showDialog = false

            },

            confirmButton = {

                TextButton(

                    onClick = {

                        showDialog = false

                    }

                ) {

                    Text("OK")

                }

            },

            dismissButton = {

                TextButton(

                    onClick = {

                        showDialog = false

                    }

                ) {

                    Text("Cancel")

                }

            }

        ) {

            DatePicker(

                state = datePickerState

            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun DatePickerPreview() {

    DatePickerExample()

}