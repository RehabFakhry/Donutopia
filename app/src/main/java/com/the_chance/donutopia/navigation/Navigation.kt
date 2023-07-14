@file:OptIn(ExperimentalMaterial3Api::class)

package com.the_chance.donutopia.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.the_chance.donutopia.ui.theme.PinkBackground
import com.the_chance.donutopia.ui.theme.White
import com.the_chance.donutopia.ui.theme.space0

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Navigation() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {}
    ){
        BottomNavGraph(navController = navController)

    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Favorites,
        BottomBarScreen.Notification,
        BottomBarScreen.Cart,
        BottomBarScreen.Profile,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(
        backgroundColor = Color.Transparent,
        elevation = space0
    ) {
        screens.forEach { screens ->
            AddItem(screen = screens,
                currentDestination = currentDestination,
                navController = navController)
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavController
){
    BottomNavigationItem(
        icon = {
            val isSelected = currentDestination?.hierarchy?.any {
                it.route == screen.route
            } == true

            val iconTintColor = if (isSelected) White else PinkBackground

            Row(
                modifier = Modifier
                    .size(52.dp)
                    .clip(if (isSelected) CircleShape else RoundedCornerShape(0.dp))
                    .background(if (isSelected) PinkBackground else Color.Transparent),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Icon(
                    painter = painterResource(screen.icon),
                    contentDescription = screen.route,
                    tint = iconTintColor,
                )
                // Add additional content if needed
            }
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )
}
