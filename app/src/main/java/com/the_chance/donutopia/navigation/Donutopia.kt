package com.the_chance.donutopia.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Donutopia() {
    val navController = rememberNavController()
    Scaffold(
        Modifier.fillMaxHeight(),
        bottomBar = {
            BottomBar(navController)
        }
    )
    { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            CompositionLocalProvider(LocalNavigationProvider provides navController) {
                BottomNavGraph(navController)
            }
        }
    }
}