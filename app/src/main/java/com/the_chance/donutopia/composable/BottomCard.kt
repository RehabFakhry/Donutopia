package com.the_chance.donutopia.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.the_chance.donutopia.R
import com.the_chance.donutopia.navigation.Screen
import com.the_chance.donutopia.ui.theme.Black
import com.the_chance.donutopia.ui.theme.Black60
import com.the_chance.donutopia.ui.theme.Black80
import com.the_chance.donutopia.ui.theme.PrimaryColor
import com.the_chance.donutopia.ui.theme.Type
import com.the_chance.donutopia.ui.theme.White
import com.the_chance.donutopia.ui.theme.White60
import com.the_chance.donutopia.ui.theme.space14
import com.the_chance.donutopia.ui.theme.space16
import com.the_chance.donutopia.ui.theme.space24
import com.the_chance.donutopia.ui.theme.space32
import com.the_chance.donutopia.ui.theme.space40
import com.the_chance.donutopia.ui.theme.space64
import com.the_chance.donutopia.ui.theme.space8
import com.the_chance.donutopia.ui.theme.textSize24
import com.the_chance.donutopia.ui.theme.textSize32

@Composable
fun BottomCard(navController: NavController) {
    Box(modifier = Modifier) {
        Card(
            modifier = Modifier
                .wrapContentSize()
                .wrapContentHeight()
                .offset((310).dp, (-35).dp),
            shape = RoundedCornerShape(size = space16),
            colors = CardDefaults.cardColors(Color.White),
        ) {
            CustomIcon()
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.56f),
            shape = RoundedCornerShape(topStart = space40, topEnd = space40),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(White)
                    .padding(vertical = space24, horizontal = space32),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(R.string.strawberry_wheel),
                    color = PrimaryColor, style = Type.SubHeader
                )
                SpacerVertical(height = space16)
                Text(
                    text = stringResource(R.string.about_gonut),
                    style = Type.Title,
                    color = Black80
                )
                SpacerVertical(height = space16)
                Text(text = stringResource(R.string.details), style = Type.SubBody, color = Black60)
                SpacerVertical(height = space16)
                Text(text = stringResource(R.string.quantity), style = Type.Title, color = Black80)
                SpacerVertical(height = space16)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space8),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CardDetails(
                        text = " - ",
                        style = Type.Title2,
                        textColor = Black,
                        background = White60,
                        modifier = Modifier,
                    )
                    SpacerHorizontal(width = space14)
                    CardDetails(
                        text = "1",
                        style = Type.SubHeader2,
                        textColor = Black,
                        background = White60,
                        modifier = Modifier,
                    )
                    SpacerHorizontal(width = space14)
                    CardDetails(
                        text = "+",
                        style = Type.Title2,
                        textColor = White,
                        background = Black,
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string._16), style = Type.SubHeader2,
                        modifier = Modifier.padding(start = space16), color = Black
                    )
                    SpacerHorizontal(width = space64)
                    ButtonClick(
                        text = stringResource(R.string.add_to_cart),
                        color = PrimaryColor,
                        textColor = White,
                        onClick = { navController.navigate(Screen.CartScreen.route) },
                        modifier = Modifier
                    )
                }
                SpacerVertical(height = space8)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookingScreen() {
    val navController = rememberNavController()
    BottomCard(navController)
}
