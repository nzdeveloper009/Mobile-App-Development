package com.example.gullapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun BottomNavigationExample() {

    var selectedItem by remember {
        mutableStateOf(0)
    }

    val items = listOf(
        "Home",
        "Search",
        "Profile"
    )

    val icons = listOf(
        Icons.Default.Home,
        Icons.Default.Search,
        Icons.Default.Person
    )

    Scaffold(

        bottomBar = {

            NavigationBar {

                items.forEachIndexed { index, item ->

                    NavigationBarItem(

                        selected = selectedItem == index,

                        onClick = {

                            selectedItem = index

                        },

                        icon = {

                            Icon(

                                imageVector = icons[index],

                                contentDescription = item

                            )

                        },

                        label = {

                            Text(item)

                        }

                    )

                }

            }

        }

    ) { padding ->

        Box(

            modifier = Modifier
                .fillMaxSize()
                .padding(padding)

        ) {

            Text(

                text = "Current Screen: ${items[selectedItem]}"

            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {

    BottomNavigationExample()

}