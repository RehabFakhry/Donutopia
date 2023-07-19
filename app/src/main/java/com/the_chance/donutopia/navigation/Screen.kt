package com.the_chance.donutopia.navigation

sealed class Screen(val route: String){
    object onBoardingScreen: Screen("OnBoardingScreen")
    object HomeScreen: Screen("HomeScreen")
    object DetailsScreen: Screen("DetailsScreen")
    object CartScreen: Screen("CartScreen")
}
