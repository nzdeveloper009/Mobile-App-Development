package com.example.gullapplication

import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun dropDownMenuExample(){
    var expanded by remember {
        mutableStateOf(false)
    }
    var Selected by remember {
        mutableStateOf("Select City")
    }
    Button(
        onClick = {
            expanded = true
        }
    )
    {
        Text(Selected)
    }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {
            expanded = false
        }
    ) {
        DropdownMenuItem(
            text = {
                Text("Karachi")
            },
            onClick = {
                Selected = "Karachi"
                expanded = false
            }
        )
        DropdownMenuItem(
            text = {
                Text("Lahore")
            },
            onClick = {
                Selected = "Lahore"
                expanded = false
            }
        )
        DropdownMenuItem(
            text = {
                Text("Islamabad")
            },
            onClick = {
                Selected = "Islamabad"
                expanded = false
            }
        )
        DropdownMenuItem(
            text = {
                Text("Peshawar")
            },
            onClick = {
                Selected = "Peshawar"
                expanded = false
            }
        )

    }

}
@Preview(showBackground = true)
@Composable
fun dropDownMenuExamplePreview(){
    dropDownMenuExample()
}