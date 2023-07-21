package com.the_chance.donutopia.ui.screens.home

import androidx.lifecycle.ViewModel
import com.the_chance.donutopia.R
import com.the_chance.donutopia.ui.theme.PinkBackground
import com.the_chance.donutopia.ui.theme.SecondaryColor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel() {
    private val _state = MutableStateFlow(DountsUiState())
    val state = _state.asStateFlow()

    init {
        getAllDountsWithPrice()
        getAllDountsWithDetails()
    }

    private fun getAllDountsWithPrice(){
        _state.update { it.copy(
            dounts = listOf(
                DountPriceUiState("Chocolate Cherry", R.drawable.image_chocolate_cherry, "$22"),
                DountPriceUiState("Strawberry Rain", R.drawable.image_strawberry_rain, "$23"),
                DountPriceUiState("Chocolate Coco", R.drawable.image_straweberry_coco, "$24"),
                DountPriceUiState("Chocolate Cherry", R.drawable.image_chocolate_cherry, "$22"),
                DountPriceUiState("Strawberry Rain", R.drawable.image_strawberry_rain, "$23"),
                DountPriceUiState("Chocolate Coco", R.drawable.image_straweberry_coco, "$24"),
            )
        ) }
    }

    private fun getAllDountsWithDetails(){
        _state.update { it.copy(
            dountDetails = listOf(
                DountDetailsUiState("Strawberry Wheel", R.drawable.image_dount,
                    false,"These Baked Strawberry Donuts are filled with fresh strawberries..."
                    ,"$20", "$16", SecondaryColor),
                DountDetailsUiState("Chocolate Glaze", R.drawable.chocolate_glaze,
                    false,"Moist and fluffy baked chocolate donuts full of chocolate flavor."
                    ,"$20", "$16", PinkBackground),
                DountDetailsUiState("Strawberry Wheel", R.drawable.image_dount,
                    false,"These Baked Strawberry Donuts are filled with fresh strawberries..."
                    ,"$20", "$16", SecondaryColor),
                DountDetailsUiState("Chocolate Glaze", R.drawable.chocolate_glaze,
                    false,"Moist and fluffy baked chocolate donuts full of chocolate flavor."
                    ,"$20", "$16", PinkBackground),
            )
        ) }
    }
}