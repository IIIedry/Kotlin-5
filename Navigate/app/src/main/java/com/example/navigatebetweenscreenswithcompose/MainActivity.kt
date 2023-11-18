package com.example.navigatebetweenscreenswithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.navigatebetweenscreenswithcompose.ui.theme.NavigateBetweenScreensWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            NavigateBetweenScreensWithComposeTheme {
                CupcakeApp()
            }
        }
    }
}