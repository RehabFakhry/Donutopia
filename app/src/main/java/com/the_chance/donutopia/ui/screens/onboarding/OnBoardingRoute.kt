package com.the_chance.donutopia.ui.screens.onboarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.the_chance.donutopia.navigation.BottomBarScreen

fun NavGraphBuilder.onBoardingRoute() {
    composable(route = BottomBarScreen.OnBoardingScreen.route) {
        OnBoardingScreen()
    }
}