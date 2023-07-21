package com.the_chance.donutopia.ui.screens.onboarding

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.the_chance.donutopia.R
import com.the_chance.donutopia.composable.ButtonClick
import com.the_chance.donutopia.composable.SpacerVertical
import com.the_chance.donutopia.navigation.BottomBarScreen
import com.the_chance.donutopia.navigation.LocalNavigationProvider
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
import com.the_chance.donutopia.ui.theme.space8

@Composable
fun OnBoardingScreen(){
    val navController = LocalNavigationProvider.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        AnimatedImage()
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
                onClick = {navController.navigate(BottomBarScreen.Home.route)},
                modifier = Modifier
            )
        }
    }
}

@Composable
fun AnimatedImage() {
    // Create the animation instance for horizontal offset
    val offsetX = remember { Animatable(-2000f) } // Start the image outside the left side of the screen

    LaunchedEffect(Unit) {
        while (true) {
            // Animate the offsetX from -2000f to 90f (left to right) over 5000 milliseconds
            offsetX.animateTo(
                targetValue = 90f,
                animationSpec = tween(durationMillis = 5000, easing = LinearOutSlowInEasing)
            )
            // Reset the offsetX to its initial value to restart the animation
            offsetX.snapTo(-2000f)
        }
    }
    Box(
        modifier = Modifier.padding(top = space16).fillMaxWidth(1.2f).height(350.dp)
            .graphicsLayer(translationX = offsetX.value) // Apply the horizontal offset animation using graphicsLayer
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(530.dp)
        )
    }
}

//@Composable
//fun AnimatedImage() {
//    // Create the animation instance
//    val scaleAnimation = rememberInfiniteTransition()
//    val scale by scaleAnimation.animateFloat(
//        initialValue = 1f, // Start scale
//        targetValue = 1.2f, // End scale
//        animationSpec = infiniteRepeatable(
//            animation = keyframes {
//                durationMillis = 1000 // Duration of each animation cycle
//                0.5f at 500 // Scale up to 1.2f at 500 ms (half of the duration)
//                1f at 1000 // Scale back to 1f at 1000 ms (full duration)
//            },
//            repeatMode = RepeatMode.Reverse
//        )
//    )
//
//    Box(
//        modifier = Modifier.fillMaxWidth(1.2f).height(350.dp)
//            .graphicsLayer(scaleX = scale, scaleY = scale) // Apply the scale animation using graphicsLayer
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.group_dounts),
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//        )
//    }
//}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewOnBoarding() {
    OnBoardingScreen()
}