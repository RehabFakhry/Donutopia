package com.the_chance.donutopia.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SpacerHorizontal(width: Dp){
    Spacer(modifier = Modifier.width(width))
}

@Composable
fun SpacerVertical(height: Dp){
    Spacer(modifier = Modifier.height(height))
}