package com.the_chance.donutopia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.the_chance.donutopia.ui.screens.CartScreen
import com.the_chance.donutopia.ui.screens.FavoritesScreen
import com.the_chance.donutopia.ui.screens.NotificationScreen
import com.the_chance.donutopia.ui.screens.ProfileScreen
import com.the_chance.donutopia.ui.screens.home.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route)
    {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController)
        }
        composable(route = BottomBarScreen.Favorites.route){
            FavoritesScreen()
        }
        composable(route = BottomBarScreen.Notification.route){
            NotificationScreen()
        }
        composable(route = BottomBarScreen.Cart.route){
            CartScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }
    }
}

