package com.the_chance.donutopia.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.the_chance.donutopia.R
import com.the_chance.donutopia.composable.ButtonClick
import com.the_chance.donutopia.composable.SpacerVertical
import com.the_chance.donutopia.navigation.Screen
import com.the_chance.donutopia.ui.theme.Background
import com.the_chance.donutopia.ui.theme.Black
import com.the_chance.donutopia.ui.theme.PrimaryColor
import com.the_chance.donutopia.ui.theme.Type
import com.the_chance.donutopia.ui.theme.White
import com.the_chance.donutopia.ui.theme.space16
import com.the_chance.donutopia.ui.theme.space24
import com.the_chance.donutopia.ui.theme.space32
import com.the_chance.donutopia.ui.theme.space40
import com.the_chance.donutopia.ui.theme.space46

@Composable
fun OnBoardingScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Box(modifier = Modifier.fillMaxWidth(1.2f).height(350.dp)) {
            Image(
                painter = painterResource(id = R.drawable.group_dounts),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Background)
                .padding(horizontal = space40)
                .padding(bottom = space46),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.gonuts_with_donuts),
                color = PrimaryColor,
                style = Type.Caption,
                modifier = Modifier.padding(end = space32)
            )
            SpacerVertical(height = space16)
            Text(
                text = stringResource(R.string.welcome_text),
                color = PrimaryColor,
                style = Type.Body,
                modifier = Modifier
            )
            SpacerVertical(height = space24)
            ButtonClick(
                text = stringResource(R.string.get_started),
                color = White,
                textColor = Black,
                onClick = {navController.navigate(Screen.HomeScreen.route)},
                modifier = Modifier
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewOnBoarding() {
    val navController = rememberNavController()
    OnBoardingScreen(navController)
}