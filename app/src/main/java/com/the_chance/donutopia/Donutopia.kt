package com.the_chance.donutopia

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.the_chance.donutopia.navigation.Navigation
import com.the_chance.donutopia.navigation.Screen
import com.the_chance.donutopia.ui.screens.CartScreen
import com.the_chance.donutopia.ui.screens.DetailsScreen
import com.the_chance.donutopia.ui.screens.OnBoardingScreen
import com.the_chance.donutopia.ui.screens.home.HomeScreen
import com.the_chance.donutopia.ui.theme.DonutopiaTheme

@Composable
fun Donutopia(){
    DonutopiaTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "onBoardingScreen"){
            composable(Screen.onBoardingScreen.route){ OnBoardingScreen(navController)}
            composable(Screen.HomeScreen.route){ HomeScreen(navController)}
            composable(Screen.DetailsScreen.route){ DetailsScreen(navController)}
            composable(Screen.CartScreen.route){ CartScreen()}
        }
//        Navigation()
    }
}