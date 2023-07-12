package com.the_chance.donutopia.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.the_chance.donutopia.R
@Composable
fun blabala(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewBla(){
    blabala()
}
