package com.example.student_job_search_app.navigation

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.student_job_search_app.ui_models.home_screen.HomeScreen
import com.example.student_job_search_app.ui_models.liked_screen.FavoritesScreen
import com.example.student_job_search_app.ui_models.my_profile.MyPage
import com.example.student_job_search_app.ui_models.navigationBar.NavigationBar

@Composable
fun Navigation() {
    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        // Home screen
        composable(Screen.Home.route) {
            HomeScreen()
            NavigationBar(
                onSearchClick = { navController.navigate(Screen.Home.route)},
                onFavoritesClick = { navController.navigate(Screen.Favorites.route)},
                onProfileClick = {navController.navigate(Screen.Profile.route)}
            )
        }
        // Profile Screen
        composable(Screen.Profile.route) {
            MyPage()
            NavigationBar(
                onSearchClick = { navController.navigate(Screen.Home.route)},
                onFavoritesClick = { navController.navigate(Screen.Favorites.route)},
                onProfileClick = {navController.navigate(Screen.Profile.route)}
            )
        }
        // Favorites screens
        composable(Screen.Favorites.route) {
            FavoritesScreen()
            NavigationBar(
                onSearchClick = { navController.navigate(Screen.Home.route)},
                onFavoritesClick = { navController.navigate(Screen.Favorites.route)},
                onProfileClick = {navController.navigate(Screen.Profile.route)}
            )
        }

    }
}