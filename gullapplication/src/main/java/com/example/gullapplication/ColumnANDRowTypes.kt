package com.example.gullapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumn(){
    Box(
        modifier = Modifier.fillMaxWidth()
    ){
    Column(
        modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy Column ")
        //prefered for list
        LazyColumn(
            modifier= Modifier.fillMaxWidth().height(200.dp).background(Color.LightGray)
        ){
            items(100){index ->
                Text(
                   text= "item $index of LazyColumn",
                    modifier = Modifier.fillMaxWidth().padding(16.dp).background(Color.White)


                )

            }
        }
    }
}}

//Lazy Row
@Composable
fun LazyRow(){
    Box(
        modifier = Modifier.fillMaxWidth()
    ){
        Column(
            modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center
        ) {
            Text("Lazy Row ")
            //prefered for list
            LazyRow(
                modifier= Modifier.fillMaxWidth().height(200.dp).background(Color.LightGray)
            ){
                items(100){index ->
                    Text(
                        text= "item $index of LazyColumn",
                        modifier = Modifier.fillMaxWidth().padding(16.dp).background(Color.White)


                    )

                }
            }
        }
    }}

@Preview(showBackground = true)
@Composable
fun Columns(){
    LazyRow()
}


