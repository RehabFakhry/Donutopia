package com.the_chance.donutopia.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.the_chance.donutopia.R
import com.the_chance.donutopia.composable.CardDount
import com.the_chance.donutopia.composable.LazyRowOffers
import com.the_chance.donutopia.composable.SpacerVertical
import com.the_chance.donutopia.navigation.LocalNavigationProvider
import com.the_chance.donutopia.ui.theme.Background
import com.the_chance.donutopia.ui.theme.Black
import com.the_chance.donutopia.ui.theme.Black60
import com.the_chance.donutopia.ui.theme.PrimaryColor
import com.the_chance.donutopia.ui.theme.Type
import com.the_chance.donutopia.ui.theme.space16
import com.the_chance.donutopia.ui.theme.space32
import com.the_chance.donutopia.ui.theme.space4
import com.the_chance.donutopia.ui.theme.space40
import com.the_chance.donutopia.ui.theme.space8

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    val navController = LocalNavigationProvider.current
    Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = space32),
            horizontalAlignment = Alignment.Start
        )
        {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = space32)
            ) {
                Column {
                    Text(
                        text = stringResource(R.string.let_s_gonuts),
                        style = Type.Title2, color = PrimaryColor
                    )
                    SpacerVertical(height = space4)
                    Text(
                        text = stringResource(R.string.order_your_favourite_donuts_from_here),
                        style = Type.SubTitle, color = Black60
                    )
                }
                Card(
                    shape = RoundedCornerShape(space16),
                    colors = CardDefaults.cardColors(Background),
                    modifier = Modifier.padding(top = space8, start = space40)
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_search),
                            tint = PrimaryColor,
                            contentDescription = stringResource(R.string.icon_search),
                        )
                    }
                }
            }
            SpacerVertical(height = space32)
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = space32)
            ) {
                Text(
                    text = stringResource(R.string.today_offers),
                    style = Type.Title, color = Black
                )
            }
            SpacerVertical(space16)
            LazyRowOffers(navController = navController)
            SpacerVertical(height = space16)
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = space32)
            ) {
                Text(text = "Donuts", style = Type.Title, color = Black)
            }
            SpacerVertical(space40)
            Row(
                Modifier.fillMaxWidth()
            ) {
                CardDount()
            }
        }
    }

@Preview(showBackground = true)
@Composable

fun PreviewHomeScreen() {
    HomeScreen()
}