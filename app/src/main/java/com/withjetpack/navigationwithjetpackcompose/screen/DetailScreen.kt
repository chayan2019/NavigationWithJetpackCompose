package com.withjetpack.navigationwithjetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen() {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Details")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(Icons.Filled.Menu, contentDescription = "menu")
                    }
                })
        },
    ) {

    }

    Spacer(modifier = Modifier.height(60.dp))
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Cyan)) {
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(20.dp)) {
            repeat(50){
                Text(text = "Data $it", color = Color.White, fontSize = 20.sp, modifier = Modifier.padding(20.dp))
            }
        }
    }

}