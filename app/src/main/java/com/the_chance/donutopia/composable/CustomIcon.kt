package com.the_chance.donutopia.composable

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.the_chance.donutopia.R
import com.the_chance.donutopia.ui.theme.PrimaryColor

@Composable
fun CustomIcon() {
    IconButton(
    onClick = { /* Handle icon click */ },
    ) {
        Icon(
            painter = painterResource(id = R.drawable.icon_favorite),
            tint = PrimaryColor,
            contentDescription = stringResource(R.string.fav_icon),
        )
    }
}