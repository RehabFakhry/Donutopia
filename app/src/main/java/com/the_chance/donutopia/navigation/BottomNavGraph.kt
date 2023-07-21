package com.the_chance.donutopia.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.the_chance.donutopia.ui.screens.CartScreen
import com.the_chance.donutopia.ui.screens.dountsdetails.DetailsScreen
import com.the_chance.donutopia.ui.screens.FavoritesScreen
import com.the_chance.donutopia.ui.screens.NotificationScreen
import com.the_chance.donutopia.ui.screens.onboarding.OnBoardingScreen
import com.the_chance.donutopia.ui.screens.ProfileScreen
import com.the_chance.donutopia.ui.screens.dountsdetails.dountsDetailsRoute
import com.the_chance.donutopia.ui.screens.home.HomeScreen
import com.the_chance.donutopia.ui.screens.home.homeRoute
import com.the_chance.donutopia.ui.screens.onboarding.onBoardingRoute

val LocalNavigationProvider = staticCompositionLocalOf<NavHostController> {
    error("No navigation host controller provided.")
}

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.OnBoardingScreen.route
    )
    {

        onBoardingRoute()
        homeRoute()

        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Favorites.route) {
            FavoritesScreen()
        }
        composable(route = BottomBarScreen.Notification.route) {
            NotificationScreen()
        }
        composable(route = BottomBarScreen.Cart.route) {
            CartScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        dountsDetailsRoute()
    }
}