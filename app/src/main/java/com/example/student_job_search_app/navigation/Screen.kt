package com.example.student_job_search_app.navigation

sealed class Screen (val route: String) {
    object Home: Screen(route = "home_screen")
    object Profile: Screen(route = "profile_screen")
    object Favorites: Screen(route = "favorite_screen")

}