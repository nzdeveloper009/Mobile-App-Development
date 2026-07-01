package com.example.gullapplication
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimePickerExample() {

    var showDialog by remember {
        mutableStateOf(false)
    }

    var showClock by remember {
        mutableStateOf(true)
    }

    val state = rememberTimePickerState(
        initialHour = 9,
        initialMinute = 30,
        is24Hour = false
    )

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

            Text("Select Time")

        }

    }

    if (showDialog) {

        AlertDialog(

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

            },

            title = {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text("Select Time")

                    IconButton(

                        onClick = {

                            showClock = !showClock

                        }

                    ) {

                        Icon(

                            imageVector =
                                if (showClock)
                                    Icons.Default.Edit
                                else
                                    Icons.Default.Schedule,

                            contentDescription = null

                        )

                    }

                }

            },

            text = {

                if (showClock) {

                    TimePicker(

                        state = state

                    )

                } else {

                    TimeInput(

                        state = state

                    )

                }

            }

        )

    }

}