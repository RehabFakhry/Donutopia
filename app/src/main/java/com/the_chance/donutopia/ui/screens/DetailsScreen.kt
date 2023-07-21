package com.the_chance.donutopia.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.the_chance.donutopia.composable.BottomCard
import com.the_chance.donutopia.composable.ImageDount
import com.the_chance.donutopia.navigation.LocalNavigationProvider

@Composable
fun DetailsScreen(){
    val navController = LocalNavigationProvider.current
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        ImageDount(navController = navController)
        Column {
            Spacer(modifier = Modifier.weight(1f))
            BottomCard(navController)
        }
    }
}


@Preview
@Composable
fun PreviewDetailsScreen(){
    DetailsScreen()
}