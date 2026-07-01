package com.example.gullapplication

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardVoice
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarExample() {

    // Search text
    var query by remember {
        mutableStateOf("")
    }

    // SearchBar open/close state
    var active by remember {
        mutableStateOf(false)
    }

    // Data list
    val programmingLanguages = listOf(
        "Kotlin",
        "Java",
        "Python",
        "C++",
        "Compose",
        "Android"
    )

    // Filter according to user input
    val filteredList = programmingLanguages.filter {
        it.contains(query, ignoreCase = true)
    }

    Scaffold(

    ) { padding ->

        SearchBar(

            modifier = Modifier.fillMaxWidth().padding(padding),

            query = query,

            onQueryChange = {
                query = it
            },

            onSearch = {
                active = false
            },

            active = active,

            onActiveChange = {
                active = it
            },

            placeholder = {
                Text("Search Language")
            },

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            },

            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.KeyboardVoice,
                    contentDescription = null
                )
            }

        ) {

            LazyColumn {

                items(filteredList) { language ->

                    ListItem(

                        headlineContent = {
                            Text(language)
                        },

                        modifier = Modifier.clickable {

                            query = language
                            active = false

                        }

                    )

                }

            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun SearchPreview() {

    SearchBarExample()

}