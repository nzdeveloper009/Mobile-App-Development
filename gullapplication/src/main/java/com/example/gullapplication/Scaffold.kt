package com.example.gullapplication

import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample(){

    Scaffold(

        topBar = {

            TopAppBar(

                title = {

                    Text("My App",modifier= Modifier.padding(10.dp), textAlign = TextAlign.Center )

                }

            )

        },

        bottomBar = {

            BottomAppBar {

                Text("Bottom Bar")

            }

        },

        floatingActionButton = {

            FloatingActionButton(

                onClick = { }

            ) {

                Icon(

                    Icons.Default.Add,

                    contentDescription = null

                )

            }

        }

    ){ innerPadding ->

        Column(

            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,



        ) {

            Text("Welcome", modifier = Modifier.padding(16.dp), fontSize =30.sp)

            Text("Jetpack Compose",fontSize = 30.sp)

        }

    }

}

@Preview(showBackground = true)
@Composable
fun ScaffoldExamplePreview(){
    ScaffoldExample()
}