package com.the_chance.donutopia.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.the_chance.donutopia.R
import com.the_chance.donutopia.ui.screens.home.DountPriceUiState
import com.the_chance.donutopia.ui.screens.home.DountsUiState
import com.the_chance.donutopia.ui.screens.home.HomeViewModel
import com.the_chance.donutopia.ui.theme.Black60
import com.the_chance.donutopia.ui.theme.PrimaryColor
import com.the_chance.donutopia.ui.theme.Type
import com.the_chance.donutopia.ui.theme.White
import com.the_chance.donutopia.ui.theme.space10
import com.the_chance.donutopia.ui.theme.space16
import com.the_chance.donutopia.ui.theme.space24
import com.the_chance.donutopia.ui.theme.space8

@Composable
fun CardDount() {
    LazyRawDountPrice()
}

@Composable
fun LazyRawDountPrice(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    LazyRawContent(state = state)
}

@Composable
private fun LazyRawContent(
    state: DountsUiState
) {
    LazyRow( modifier = Modifier.padding(start = space16),
        horizontalArrangement = Arrangement.spacedBy(24.dp),
        contentPadding = PaddingValues(space16)
    ) {
        items(state.dounts) {
            DountsPriceItem(state = it)
        }
    }
}

@Composable
fun DountsPriceItem(state: DountPriceUiState) {
    Box(
        modifier = Modifier
            .width(138.dp)
            .height(120.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    White, shape = RoundedCornerShape(
                        topStart = space24, topEnd = space24,
                        bottomStart = space10, bottomEnd = space10
                    )
                ),
            colors = CardDefaults.cardColors(White),
            elevation = CardDefaults.cardElevation(1.dp)
        )
        {
        }
        Card(
            modifier = Modifier
                .size(120.dp)
                .offset(0.dp, (-55).dp)
                .background(Color.Transparent)
                ,colors = CardDefaults.cardColors(Color.Transparent)

        ) {
            Image(modifier = Modifier.fillMaxSize(),
                painter = rememberAsyncImagePainter(model = state.image),
                contentDescription = stringResource(R.string.dounts_image)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(state.name, style = Type.SubTitle, color = Black60)
            SpacerVertical(height = space8)
            Text(state.price, style = Type.SubTitle, color = PrimaryColor)
            SpacerVertical(height = space8)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardDount() {
    CardDount()
}