package com.the_chance.donutopia.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun MyTextStyle(
    title: String,
    color: Color,
    size: Int,
    fontFamily: FontFamily,
    fontWeight: FontWeight,
    modifier: Modifier
) {
    Text(text = title ,
        color = color ,
        fontSize = size.sp,
        fontFamily = fontFamily,
        fontWeight = fontWeight,
    )
}
