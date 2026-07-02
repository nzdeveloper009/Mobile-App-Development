package com.example.gullapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun AppExample() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Home
    ) {

        composable<Routes.Home> {
            HomeScreen(navController)
        }

        composable<Routes.WishList> {
            WishListScreen(navController)
        }
    }
}