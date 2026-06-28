package com.example.gullapplication

import android.widget.CheckBox
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxExample(){
    var childCheckBox= remember{
        mutableListOf(false,false,false)

    }
    val parentState = when{
        childCheckBox.all{it} -> ToggleableState.On //sare select
        childCheckBox.none() -> ToggleableState.Off //koi bhi nai
        else -> ToggleableState.Indeterminate  //koi aik

    }
    Column(
        modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Text("Select All")
            TriStateCheckbox(
                state = parentState,
                onClick = {
                    val newState = parentState != ToggleableState.On
                    childCheckBox.forEachIndexed { index,checked ->
                        childCheckBox[index] = newState
                    }
                }
            )
        }
            childCheckBox.forEachIndexed { index, checked ->
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text("option ${index +1}")
                            Checkbox(
                                checked = checked,
                                onCheckedChange = {
                                    childCheckBox[index] = it
                                }
                            )
                        }

                    }
                }

        }
    if(childCheckBox.all{it}){
        Text("All selected")
    }
    }

@Preview(showBackground = true)
@Composable
fun CheckBoxExamplePreview(){
    CheckBoxExample()

}