package com.the_chance.donutopia.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.the_chance.donutopia.R
import com.the_chance.donutopia.ui.screens.dountsdetails.DetailsUiState
import com.the_chance.donutopia.ui.theme.Background
import com.the_chance.donutopia.ui.theme.PinkBackground
import com.the_chance.donutopia.ui.theme.PrimaryColor
import com.the_chance.donutopia.ui.theme.space24
import com.the_chance.donutopia.ui.theme.space32

@Composable
fun ImageDount(
    navController: NavController,
    donutState: DetailsUiState,
    modifier: Modifier = Modifier,
    ) {
    Box(
        modifier = modifier.fillMaxHeight(.5f).fillMaxWidth()
            .background(Background),
    ) {
        Image(
            painter = rememberAsyncImagePainter(donutState.image),
            contentDescription = donutState.description,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxWidth()
                .aspectRatio(1F)
                .align(Alignment.Center),
        )

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = space24)
                .padding(top = space24),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BackArrow(navController = navController)
        }

    }
}

@Composable
fun BackArrow(navController: NavController){
    Box(
        modifier = Modifier
            .size(space32)
            .clickable {
                navController.navigateUp()
            },
        contentAlignment = Alignment.Center
    ){
        Icon(painter = painterResource(id = R.drawable.icon_arrow_back),
            contentDescription = stringResource(R.string.arrow_back),
            tint = PrimaryColor,
            modifier = Modifier.size(24.dp))
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ImageIcon(){
//    val navController = rememberNavController()
//    ImageDount(navController )
//}
