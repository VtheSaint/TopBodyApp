@file:OptIn(ExperimentalMaterial3Api::class)

package com.hlebnikov.topbodyapp.ui.screens.call

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hlebnikov.topbodyapp.R
import com.hlebnikov.topbodyapp.fakeData.fake_call_list
import com.hlebnikov.topbodyapp.ui.components.BottomCard
import com.hlebnikov.topbodyapp.ui.components.CallCard
import com.hlebnikov.topbodyapp.ui.screens.call.models.CallViewState
import com.hlebnikov.topbodyapp.utils.Call


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CallScreen(
    viewModel: CallViewModel,
    navController: NavController
) {
    // Initializing the state
    val state = viewModel.viewState.observeAsState(CallViewState())

    // Fake Data
    val call_list = fake_call_list
//    LaunchedEffect(true) {
//
////        call_list =  runBlocking {
////            println("Start")
////            getCallList()
////        }
//        call_list = fake_call_list
//        println("Ended")
//        println(call_list)
//    }
    Scaffold(
        topBar = { AppBar() },
    ) {
        Column (
            modifier = Modifier
                .padding(start = 30.dp, top = 40.dp, bottom = 70.dp, end = 30.dp)
                .fillMaxSize()
        ) {
            LazyColumn( ) {
                // Checking nullException
                if ( call_list.results is List<Call>) {
                    items(items = call_list.results){
                        Spacer(modifier = Modifier.height(8.dp))
                        // TODO Fix navigation
                        CallCard(
                            title = it.name,
                            isLogged = false,
                            isDone = false,
                            call_id = it.id,
                            avatars = it.avatar,
                            background = it.image_list,
                            navController = navController
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
            // Doesn't showing !
            BottomCard()
        }

    }
}



@Composable
private fun AppBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
    ) {
        Spacer(modifier = Modifier.weight(1.0f))
        Text(
            stringResource(id = R.string.call_list),
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 28.sp,
//                        fontFamily = FontFamily(Font(R.font.roboto)),
                fontWeight = FontWeight(500),
                color = Color(0xFF44464F),
                textAlign = TextAlign.Center,
            )
        )
        Spacer(modifier = Modifier.weight(1.0f))
    }
}