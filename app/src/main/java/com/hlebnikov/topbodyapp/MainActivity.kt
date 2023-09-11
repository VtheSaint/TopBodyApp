package com.hlebnikov.topbodyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.hlebnikov.topbodyapp.ui.theme.AppTheme
import com.hlebnikov.topbodyapp.ui.theme.TopBodyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TopBodyTheme {
                val systemUiController = rememberSystemUiController()

                val primaryBackground = AppTheme.colors.White
                SideEffect {

                    systemUiController.setSystemBarsColor(
                        color = primaryBackground,
                    )
                }
                MainView(mainViewModel)

            }
        }
    }
}






