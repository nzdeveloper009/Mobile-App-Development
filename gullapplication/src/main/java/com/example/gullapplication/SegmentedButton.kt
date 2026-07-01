package com.example.gullapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SegmentedButtonExample() {

    val options = listOf(
        "Day",
        "Week",
        "Month"
    )

    var selectedIndex by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        SingleChoiceSegmentedButtonRow {

            options.forEachIndexed { index, label ->

                SegmentedButton(

                    selected = selectedIndex == index,

                    onClick = {
                        selectedIndex = index
                    },

                    shape = SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = options.size
                    ),

                    label = {
                        Text(label,
                            color = Color.Black)
                    }

                )

            }

        }

        Text(
            text = "Selected: ${options[selectedIndex]}"
        )

    }
}

@Preview(showBackground = true)
@Composable
fun SegmentedButtonPreview() {
    SegmentedButtonExample()
}