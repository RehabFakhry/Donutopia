package com.the_chance.donutopia.ui.screens.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.the_chance.donutopia.navigation.BottomBarScreen

fun NavGraphBuilder.homeRoute() {
    composable(route = BottomBarScreen.Home.route) {
        HomeScreen()
    }
}