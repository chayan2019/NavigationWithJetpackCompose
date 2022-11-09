package com.withjetpack.navigationwithjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.withjetpack.navigationwithjetpackcompose.screen.DetailScreen
import com.withjetpack.navigationwithjetpackcompose.screen.HomeScreen
import com.withjetpack.navigationwithjetpackcompose.screen.ProfileScreen
import com.withjetpack.navigationwithjetpackcompose.utils.NavigationScreen

@Composable
fun NavigationController() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationScreen.Homescreen.route) {
        composable(NavigationScreen.Homescreen.route) {
            HomeScreen(navController)
        }
        composable(NavigationScreen.Detailscreen.route) {
            var data = it.arguments?.get("data")
            DetailScreen(navController)
        }
        composable(NavigationScreen.ProfileScreen.route) {
            ProfileScreen(navController)
        }
    }

}