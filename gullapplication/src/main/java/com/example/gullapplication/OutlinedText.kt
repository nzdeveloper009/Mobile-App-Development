package com.example.gullapplication

import android.text.Layout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview


//remember -> State mai value ko yaad rakhna ho
//new input se pehli last value ko yaad rakhe ga
//last yaad nai rakhe ga tu update kise kare ga?


//remember state -> input karte howe hum ne half input ki hai tu wo recompsoition  mai wo half input yaad rakhta hai
//user wahin se next continue kar sakta hai
//e.g : sign up karte howe half credentials enter kiye hain
//without it state forget ho jati hai..UI update hone ki wajah se

@Composable
fun SimpleOutlined()
{
    var text by remember {
        mutableStateOf("")
    }
    val textColor = listOf(
        Color.Blue,
        Color.Red,
        Color.Magenta,
        Color.Gray,
        Color.Cyan,
        Color.Yellow,
        Color.Green
    )

    val brush = remember {
        Brush.linearGradient(
            colors = textColor
        )
    }
   Box(
       modifier= Modifier.fillMaxSize(),
       contentAlignment = Alignment.Center
   )

//       OutlinedTextField(
//           value = text,
//           onValueChange = {
//               text = it   //updated value ko text mai store karwa rahe hain
//           },
//           label = {
//               Text(text = "Label")
//           }
//       )

   {
       TextField(
           value = text,
           onValueChange = {
               text = it   //updated value ko text mai store karwa rahe hain
           },
           textStyle = TextStyle(brush = brush) //brush jo hum ne create kiya tha
       )
   }

}


// Text with Password
@Composable
fun SimplePassword()
{
    var password by rememberSaveable {
        mutableStateOf("")
    }
 Box(
     modifier = Modifier.fillMaxSize(),
     contentAlignment = Alignment.Center
 ) {
     TextField(
         value = password,
         onValueChange = {
             password = it
         },
         label = {
             Text(text = "Password")
         },
         visualTransformation = PasswordVisualTransformation(),
         keyboardOptions = KeyboardOptions(
             keyboardType = KeyboardType.Password
         )
     )
 }
}
@Preview(showBackground = true)
@Composable
fun PreviewFunction(){
SimplePassword()
}





