package com.the_chance.donutopia.ui.screens.dountsdetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.the_chance.donutopia.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    ): ViewModel(){
    private val _state = MutableStateFlow(DetailsUiState())
    val state = _state.asStateFlow()

    private val args = DountDetailsArgs(savedStateHandle)

    init {
        getDountDetailsById()
    }

    private fun getDountDetailsById() {
        val donut = getDonutsDetails().first{ donut-> donut.title == args.donutTitle}
        _state.update {
            it.copy(
                id = donut.id,
                title = donut.title,
                description = donut.description,
                image = donut.image,
                quantity = donut.quantity,
                price = donut.price
            )
        }
    }

    private fun getDonutsDetails(): List<DetailsUiState> {
        return listOf(
            DetailsUiState(
                id = 0,
                title = "Strawberry Wheel",
                description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                image = R.drawable.image_dount,
                quantity = 1,
                price = "$20"
            ),
            DetailsUiState(
                id = 1,
                title = "Chocolate Glaze",
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                image = R.drawable.chocolate_glaze,
                quantity = 1,
                price = "$20"
            ),
            DetailsUiState(
                id = 2,
                title = "Chocolate Cherry",
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                image = R.drawable.image_chocolate_cherry,
                quantity = 1,
                price = "$22"
            ),
            DetailsUiState(
                id = 3,
                title = "Strawberry Rain",
                description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                image = R.drawable.image_strawberry_rain,
                quantity = 1,
                price = "$22"
            ),
        )
    }
}