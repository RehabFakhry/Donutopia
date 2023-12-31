package com.the_chance.donutopia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.the_chance.donutopia.navigation.Donutopia
import com.the_chance.donutopia.ui.theme.DonutopiaTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DonutopiaTheme {
                Donutopia()
            }
        }
    }
}
