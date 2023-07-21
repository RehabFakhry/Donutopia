package com.the_chance.donutopia.ui.screens.dountsdetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.the_chance.donutopia.composable.BottomCard
import com.the_chance.donutopia.composable.ImageDount
import com.the_chance.donutopia.navigation.LocalNavigationProvider
import com.the_chance.donutopia.ui.theme.space16

@Composable
fun DetailsScreen(
    viewModel: DetailsViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    val navController = LocalNavigationProvider.current

    DetailsContent(navController = navController, state = state)
}

@Composable
fun DetailsContent(
    navController: NavController,
    state: DetailsUiState,
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        ImageDount(navController = navController, donutState = state)
        BottomCard(navController, modifier = Modifier.align(Alignment.BottomCenter), state)
    }
}

@Preview
@Composable
fun PreviewDetailsScreen() {
    DetailsScreen()
}