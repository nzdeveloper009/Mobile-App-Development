package com.example.gullapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

//layout is structure
//1. column: it allows you to place elements on the screen vertically
//2. Row: it allows you to place elements on the screen horizontally

@Composable
fun ColumnExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "Hello1",fontSize = 30.sp)
            Text(text = "World2")
            Text(text = "Welcome3")
        }

    }
}

@Composable
fun RowExample(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Row(
            modifier = Modifier.fillMaxSize().background(Color.Gray).padding(15.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Hello1")
            Text(text = "World2")
            Text(text = "Welcome3")

        }
    }
}

//Box
//empty container ...overlapping ho gi
@Composable
fun BoxExample(){
    Box(
        modifier = Modifier.size(200.dp).background(Color.Gray),
        contentAlignment = Alignment.Center
      )
    {
        Box(
            modifier = Modifier.size(100.dp).background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {}

    }

}

//4. Constraint Layout-> USES MORE CPU, GRAPHICS, USE ONLY WHEN NEEDED AND HAVE COMPLEX UI,
//ALSO POWERFUL
//PERFORMANCE INEFFICIENT

@Composable
fun ConstraintLayoutExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            ConstraintLayout(
                modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.DarkGray)

            ) {
                val (text1, text2, text3) = createRefs()
                //text aik  dosre ky reference se attach hai
                Text(
                    "Botton Left",
                    modifier = Modifier.constrainAs(text1) {
                        top.linkTo(parent.top,margin= 8.dp)
                        bottom.linkTo(parent.bottom, margin = 8.dp)
                        start.linkTo(parent.start, margin = 8.dp)
                        end.linkTo(text2.end, margin = 8.dp)


                    }
                )
                Text(
                    "Center Left",
                    modifier = Modifier.constrainAs(text2) {
                        top.linkTo(parent.top, margin = 8.dp)
                        bottom.linkTo(parent.bottom, margin = 8.dp)
                        start.linkTo(text1.start, margin = 8.dp)
                        end.linkTo(text3.end, margin = 8.dp)

                    }
                )
                Text(
                    "Top Right",
                    modifier = Modifier.constrainAs(text3) {
                        top.linkTo(parent.top, margin = 8.dp)
                        start.linkTo(text2.end, margin = 8.dp)
                        end.linkTo(parent.end, margin = 8.dp)
                        bottom.linkTo(parent.bottom, margin = 8.dp)


                    }
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Layout(){
 ConstraintLayoutExample()
}


