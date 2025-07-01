package com.falafacil.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.falafacil.app.ui.screens.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val startDestination = "home"

    NavHost(navController = navController, startDestination = startDestination) {
        composable("home") {
            HomeScreen()
        }
    }
}
