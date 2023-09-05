package com.the_chance.donutopia.ui.screens.dountsdetails

import androidx.lifecycle.SavedStateHandle

class DountDetailsArgs(savedStateHandle: SavedStateHandle){
    val donutTitle: String = checkNotNull(savedStateHandle[DONUT_TITLE])

    companion object {
        const val DONUT_TITLE = "donut_title"
    }
}