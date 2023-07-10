package com.the_chance.donutopia.navigation

import com.the_chance.donutopia.R


sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        title = null.toString(),
        icon = R.drawable.icon_home
    )

    object Favorites : BottomBarScreen(
        route = "favorites",
        title = null.toString(),
        icon = R.drawable.icon_favorites
    )

    object Notification : BottomBarScreen(
        route = "notification",
        title = null.toString(),
        icon = R.drawable.icon_notification
    )

    object Cart : BottomBarScreen(
        route = "cart",
        title = null.toString(),
        icon = R.drawable.icon_cart
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = null.toString(),
        icon = R.drawable.icon_profile
    )
}
