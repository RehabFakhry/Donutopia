package com.the_chance.donutopia.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.the_chance.donutopia.composable.BottomCard
import com.the_chance.donutopia.composable.ImageDount

@Composable
fun DetailsScreen(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        ImageDount(navController = navController)
        Column {
            Spacer(modifier = Modifier.weight(1f))
            BottomCard()
        }
    }
}

//Column {
//    Card(shape = RoundedCornerShape(space16), modifier = Modifier.padding(start = space100)) {
//        Box(
//            modifier = Modifier.background(White),
//            contentAlignment = Alignment.Center,
//        ) {
//            IconButton(
//                onClick = { /* Handle icon click */ },
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.icon_favorite),
//                    tint = PrimaryColor,
//                    contentDescription = stringResource(R.string.fav_icon),
//                )
//            }
//        }
//    }
//}

@Preview
@Composable
fun PreviewDetailsScreen(){
    val navController = rememberNavController()
    DetailsScreen(navController = navController)
}