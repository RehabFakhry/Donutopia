package com.the_chance.donutopia.ui.screens.dountsdetails

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.the_chance.donutopia.navigation.BottomBarScreen

val detailsRoute = "${BottomBarScreen.DetailsScreen.route}/{${DountDetailsArgs.DONUT_TITLE}}"

fun NavController.navigateToDetails(donutTitle: String) {
    navigate("${BottomBarScreen.DetailsScreen.route}/$donutTitle")
}

fun NavGraphBuilder.dountsDetailsRoute() {
    composable(route = detailsRoute,
    arguments = listOf(
        navArgument(DountDetailsArgs.DONUT_TITLE){ NavType.StringType }
    )
    ) {
        DetailsScreen()
    }
}