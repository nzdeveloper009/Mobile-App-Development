package com.example.gullapplication
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample() {

    Scaffold(

        topBar = {

            TopAppBar(

                title = {

                    Column {

                        Text(
                            text = "Home",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )

                        Text(
                            text = "This is the location Delhi",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )

                    }

                },

                navigationIcon = {

                    IconButton(
                        onClick = { }
                    ) {

                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Location",
                            tint = Color.Red
                        )

                    }

                },

                actions = {

                    BadgedBox(

                        badge = {

                            Badge {

                                Text("3")

                            }

                        }

                    ) {

                        IconButton(
                            onClick = { }
                        ) {

                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "Notification"
                            )

                        }

                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Box(

                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray),

                        contentAlignment = Alignment.Center

                    ) {

                        Text(
                            text = "G",
                            fontWeight = FontWeight.Bold
                        )

                    }

                    Spacer(modifier = Modifier.width(8.dp))

                }

            )

        }

    ) { padding ->

        Box(

            modifier = Modifier
                .fillMaxSize()
                .padding(padding),

            contentAlignment = Alignment.Center

        ) {

            Text("Home Screen")

        }

    }

}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {

    TopAppBarExample()

}