package com.the_chance.donutopia.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.the_chance.donutopia.R
import com.the_chance.donutopia.ui.screens.home.DountDetailsUiState
import com.the_chance.donutopia.ui.screens.home.DountsUiState
import com.the_chance.donutopia.ui.screens.home.HomeViewModel
import com.the_chance.donutopia.ui.theme.Black
import com.the_chance.donutopia.ui.theme.Black60
import com.the_chance.donutopia.ui.theme.PrimaryColor
import com.the_chance.donutopia.ui.theme.SecondaryColor
import com.the_chance.donutopia.ui.theme.Type


@Composable
fun LazyRowOffers(
    homeViewModel : HomeViewModel = hiltViewModel()
){
    val state by homeViewModel.state.collectAsState()
    LazyRowDonut(state = state )
}
@Composable
fun LazyRowDonut(state : DountsUiState){
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(325.dp),
//        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(48.dp)
    ){
        items(state.dountDetails){
            DonutCard(state = it)
        }
    }
}
@Composable
fun DonutCard(
    state : DountDetailsUiState
) {
    Box(
        modifier = Modifier
            .height(325.dp)
            .width(193.dp),
    contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier.fillMaxSize(),
            colors = CardDefaults.cardColors(SecondaryColor)
        ) { }
        Card(shape = CircleShape,
            modifier = Modifier.offset((-60).dp, (-110).dp)
        ) {
            Box(
                modifier = Modifier.background(Color.White),
                contentAlignment = Alignment.Center,
            ) {
                IconButton(
                    onClick = { /* Handle icon click */ },
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_favorite),
                        tint = PrimaryColor, contentDescription = "",
                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .size(180.dp)
                .offset(60.dp, (-50).dp)
                .background(Color.Transparent),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
        Image(
            painter = rememberAsyncImagePainter(model = state.image),
            contentDescription = "category",
            modifier = Modifier.fillMaxSize(),
        )
    }
        Column(
            modifier = Modifier
                .padding(16.dp)
                .padding(4.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(text = state.name, color = Black, style = Type.Body)
            SpacerVertical(height = 8.dp)
            Text(
                text = state.description, color = Black60, style = Type.Description
            )
            SpacerVertical(height = 4.dp)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = state.oldPrice,
                    color = Black60, style = Type.SubTitle)
                SpacerHorizontal(width = 4.dp)
                Text(
                    text = state.newPrice,
                    color = Black, style = Type.SubHeader2
                )
            }
        }

    }
}

@Composable
fun RoundedIconButton(
    color: Color,
    icon: Int,
) {
    Card(shape = RoundedCornerShape(16.dp)) {
        Box(
            modifier = Modifier
                .background(color),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                onClick = { /*TODO*/ },
            ) {
                CustomIcon()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeComposable() {
    LazyRowOffers()
}