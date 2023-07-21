package com.the_chance.donutopia.navigation

import com.the_chance.donutopia.R


sealed class BottomBarScreen(
    val route: String,
    val icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        icon = R.drawable.icon_home
    )

    object Favorites : BottomBarScreen(
        route = "favorites",
        icon = R.drawable.icon_favorites
    )

    object Notification : BottomBarScreen(
        route = "notification",
        icon = R.drawable.icon_notification
    )

    object Cart : BottomBarScreen(
        route = "cart",
        icon = R.drawable.icon_cart
    )

    object Profile : BottomBarScreen(
        route = "profile",
        icon = R.drawable.icon_profile
    )

    object OnBoardingScreen :BottomBarScreen(
        route = "OnBoardingScreen",
        0
    )
    object DetailsScreen :BottomBarScreen(
        route = "DetailsScreen",
        0
    )
}

