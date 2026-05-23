package com.example.gullapplication

import android.text.Layout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


//remember -> State mai value ko yaad rakhna ho
//new input se pehli last value ko yaad rakhe ga
//last yaad nai rakhe ga tu update kise kare ga?


//remember state -> input karte howe hum ne half input ki hai tu backened mai wo half input yaad rakhta hai
//user wahin se next continue kar sakta hai
//e.g : sign up karte howe half credentials enter kiye hain
//without it state forget ho jati hai..UI update hone ki wajah se

@Composable
fun SimpleOutlined()
{
    var text by remember {
        mutableStateOf("")
    }
   Box(
       modifier= Modifier.fillMaxSize(),
       contentAlignment = Alignment.Center
   )
   {
       OutlinedTextField(
           value = text,
           onValueChange = {
               text = it   //updated value ko text mai store karwa rahe hain
           },
           label = {
               Text(text = "Label")
           }
       )
   }

}

@Preview(showBackground = true)
@Composable
fun SimpleOutlinedPreview(){
    SimpleOutlined()
}




