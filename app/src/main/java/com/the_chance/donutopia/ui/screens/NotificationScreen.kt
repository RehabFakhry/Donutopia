package com.the_chance.donutopia.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun NotificationScreen(){
    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hello Notification Screen", textAlign = TextAlign.Center)
    }
}