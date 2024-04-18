package com.example.student_job_search_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        // Home screen
        composable(Screen.Home.route) {

        }
        // Profile Screen
        composable(Screen.Profile.route) {

        }
        // Favorites screens
        composable(Screen.Favorites.route) {

        }

    }
}