package com.hlebnikov.topbodyapp

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hlebnikov.topbodyapp.ui.screens.call.CallScreen
import com.hlebnikov.topbodyapp.ui.screens.call.CallViewModel
import com.hlebnikov.topbodyapp.ui.screens.call.views.CallInfoScreen
import com.hlebnikov.topbodyapp.ui.theme.AppTheme


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainView(
    viewModel: MainViewModel
) {
    val state = viewModel.viewState.observeAsState(MainViewState())
    // TODO ADD Launched Effect implementation
    val navController = rememberNavController()

    // For navigation
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Вызов", "Профиль")
    val icons = listOf(R.drawable.call_icon, R.drawable.profile_icon)
    val click = listOf("CallList", "Profile")
    //

    Scaffold (
        bottomBar = {
            NavigationBar (containerColor = AppTheme.colors.White) {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(painter = painterResource(id = icons[index]), contentDescription = null) },
                        label = { Text(item) },
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                            navController.navigate(click[index])
                        }
                    )
                }
            }
        },
        containerColor = Color.Transparent
    ) {
        NavHost(navController = navController, startDestination = "CallList") {
            composable("Login") {

            }
            composable("CallList") {
                val viewModel: CallViewModel = hiltViewModel()
                CallScreen(viewModel = viewModel, navController = navController)
            }
            composable("CallInfo/${id}") {
                CallInfoScreen(id = id, navController)
            }
            composable("Profile") {
                Text(text = "Заглушка")
            }
        }
    }
}

