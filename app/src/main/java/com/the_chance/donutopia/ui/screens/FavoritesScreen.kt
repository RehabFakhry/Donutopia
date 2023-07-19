package com.the_chance.donutopia.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun FavoritesScreen(){
    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hello Favorites Screen")
    }
}