package com.withjetpack.navigationwithjetpackcompose.utils

sealed class NavigationScreen(var route: String) {
    object Homescreen : NavigationScreen("Home")
    object Detailscreen : NavigationScreen("{data}/Details") {
        fun createRoute(data:String)= "$data/Details"
    }
    object ProfileScreen : NavigationScreen("profile")
}