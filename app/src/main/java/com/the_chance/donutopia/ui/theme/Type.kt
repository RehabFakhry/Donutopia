package com.the_chance.donutopia.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

object Type {
    val Caption = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Bold,
        fontSize = textSize54,
        letterSpacing = textSize0
    )

    val SubHeader = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Bold,
        fontSize = textSize24,
        letterSpacing = textSize0
    )

    val SubHeader2 = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Medium,
        fontSize = textSize24,
        letterSpacing = textSize0
    )

    val Body = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Medium,
        fontSize = textSize18,
        letterSpacing = textSize0
    )

    val SubBody = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Light,
        fontSize = textSize16,
        letterSpacing = textSize0
    )

    val Title = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Medium,
        fontSize = textSize20,
        letterSpacing = textSize0
    )

    val Title2 = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.SemiBold,
        fontSize = textSize32,
        letterSpacing = textSize0
    )

    val SubTitle = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Medium,
        fontSize = textSize14,
        letterSpacing = textSize0
    )

    val Description = TextStyle(
        fontFamily = Robot,
        fontWeight = FontWeight.Normal,
        fontSize = textSize12,
        letterSpacing = textSize0
    )
}
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */