package com.the_chance.donutopia

import androidx.compose.runtime.Composable
import com.the_chance.donutopia.navigation.Navigation
import com.the_chance.donutopia.ui.theme.DonutopiaTheme

@Composable
fun Donutopia(){
    DonutopiaTheme {
        Navigation()
    }

}