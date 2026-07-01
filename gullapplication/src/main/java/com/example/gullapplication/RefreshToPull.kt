package com.example.gullapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PullToRefreshExample() {

    var isRefreshing by remember {
        mutableStateOf(false)
    }

    val refreshState = rememberPullToRefreshState()

    val scope = rememberCoroutineScope()

    PullToRefreshBox(

        state = refreshState,

        isRefreshing = isRefreshing,

        onRefresh = {

            scope.launch {

                isRefreshing = true

                delay(3000)

                isRefreshing = false

            }

        }

    ) {

        LazyColumn {

            items(20) {

                Text(
                    text = "Item ${it + 1}",
                    modifier = Modifier.padding(16.dp)
                )

            }

        }

    }

}