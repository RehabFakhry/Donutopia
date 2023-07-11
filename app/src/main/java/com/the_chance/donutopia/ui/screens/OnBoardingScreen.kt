package com.the_chance.donutopia.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_chance.donutopia.R
import com.the_chance.donutopia.composable.ButtonClick
import com.the_chance.donutopia.composable.MyTextStyle
import com.the_chance.donutopia.composable.SpacerVertical
import com.the_chance.donutopia.ui.theme.Background
import com.the_chance.donutopia.ui.theme.Black
import com.the_chance.donutopia.ui.theme.PrimaryColor
import com.the_chance.donutopia.ui.theme.Robot
import com.the_chance.donutopia.ui.theme.Type
import com.the_chance.donutopia.ui.theme.White
import com.the_chance.donutopia.ui.theme.space100
import com.the_chance.donutopia.ui.theme.space24
import com.the_chance.donutopia.ui.theme.space32
import com.the_chance.donutopia.ui.theme.space40

@Composable
fun OnBoarding(){
    Column(
        modifier = Modifier.fillMaxSize().background(Background).padding(32.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



        SpacerVertical(height = space100)
        Text(
            text = stringResource(R.string.gonuts_with_donuts),
            color = PrimaryColor ,
            style = Type.Caption,
            modifier = Modifier.padding(horizontal = space32)
        )
        SpacerVertical(height = space24)
        Text(
            text = stringResource(R.string.welcome_text),
            color = PrimaryColor ,
            style = Type.Body,
            modifier = Modifier.padding(horizontal = space32)
        )
        SpacerVertical(height = space40)
        ButtonClick(
            text = stringResource(R.string.get_started),
            color = White ,
            textColor = Black,
            onClick = {},
            modifier = Modifier
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewOnBoarding(){
    OnBoarding()
}