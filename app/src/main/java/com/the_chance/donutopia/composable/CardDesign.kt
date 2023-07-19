package com.the_chance.donutopia.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.the_chance.donutopia.ui.theme.space14

@Composable
fun CardDetails(
    modifier: Modifier,
    text: String,
    style: TextStyle,
    background: Color,
    textColor: Color,
    ) {
        Card(
            modifier = modifier.size(45.dp),
            colors = CardDefaults.cardColors(containerColor = background),
            shape = RoundedCornerShape(space14),
            ) {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center

            ) {
                Text(
                    text = text,
                    color = textColor,
                    style = style)
            }

        }
    }
