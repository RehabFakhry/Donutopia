package com.the_chance.donutopia.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_chance.donutopia.ui.theme.Background
import com.the_chance.donutopia.ui.theme.Black
import com.the_chance.donutopia.ui.theme.Type
import com.the_chance.donutopia.ui.theme.space16

@Composable
fun ButtonClick(
    text: String,
    color: Color,
    textColor: Color,
    onClick: () -> Unit,
    modifier: Modifier,
) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(.8f),
        colors = ButtonDefaults.buttonColors(color),
        contentPadding = PaddingValues(space16)
    ) {
        Text(
            text = text,
            color = textColor ,
            style = Type.Title,
            modifier = modifier
        )
    }
}

@Preview
@Composable
fun PreviewButton(){
    ButtonClick(text = "rrrr", color = Background, Black , {}, modifier = Modifier)
}
