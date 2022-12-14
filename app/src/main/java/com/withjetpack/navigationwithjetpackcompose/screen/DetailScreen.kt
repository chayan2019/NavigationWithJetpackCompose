package com.withjetpack.navigationwithjetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.PopUpToBuilder
import com.withjetpack.navigationwithjetpackcompose.utils.NavigationScreen
import java.util.Stack

@Composable
fun DetailScreen(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Details Screen")
                },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(NavigationScreen.ProfileScreen.route)
                    }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "menu")

                    }
                })
        },
    ) {

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navController.navigate(NavigationScreen.ProfileScreen.route){
                launchSingleTop=true
            }

        }) {
            Text(text = "Details Screen")
        }
    }
}