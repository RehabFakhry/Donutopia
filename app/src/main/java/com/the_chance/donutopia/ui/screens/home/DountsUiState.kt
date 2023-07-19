package com.the_chance.donutopia.ui.screens.home

import androidx.compose.ui.graphics.Color

data class DountsUiState(
    val dounts: List<DountPriceUiState> = emptyList(),
    val dountDetails: List<DountDetailsUiState> = emptyList(),
)

data class DountPriceUiState(
    val name: String,
    val image: Int,
    val price: String,
)

data class DountDetailsUiState(
    val name: String,
    val image: Int,
    val description: String,
    val oldPrice: String,
    val newPrice: String,
    val cardBackground: Color,
)
