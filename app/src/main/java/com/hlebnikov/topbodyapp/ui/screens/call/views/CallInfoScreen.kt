package com.hlebnikov.topbodyapp.ui.screens.call.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlebnikov.topbodyapp.R
import com.hlebnikov.topbodyapp.fakeData.fakeCallInfo
import com.hlebnikov.topbodyapp.ui.components.AboutCall
import com.hlebnikov.topbodyapp.ui.components.AchiveCard
import com.hlebnikov.topbodyapp.ui.components.CallCardWithoutButton
import com.hlebnikov.topbodyapp.ui.components.InfoCard
import com.hlebnikov.topbodyapp.ui.components.TripleColorsButton
import com.hlebnikov.topbodyapp.ui.theme.AppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CallInfoScreen(
    id: Number
) {
    val state = fakeCallInfo
    Scaffold  (
        topBar = {
            Row (
                modifier = Modifier
                    .background(AppTheme.colors.White)
                    .fillMaxWidth()
            ) {

            // TODO center text
                Icon(
                    painter = painterResource(id = R.drawable.arrow_back),
                    contentDescription = null,
                    modifier = Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.weight(1f))
                Column ( modifier = Modifier.padding(top = 8.dp, end= 22.dp)) {
                    Text(
                        text = stringResource(id = R.string.call),
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 28.sp,
//                            fontFamily = FontFamily(Font(R.font.roboto)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF44464F),
                            textAlign = TextAlign.Center,
                        )
                        )
                    Text(
                        text = "245 человек",
                        style = TextStyle(
                            fontSize = 12.sp,
//                            fontFamily = FontFamily(Font(R.font.roboto)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF989898),
                            textAlign = TextAlign.Center,
                        )
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        },
        content = {
            Column (modifier = Modifier.background(AppTheme.colors.DarkOrange)) {
                CallCardWithoutButton(
                    title = state.name!!,
                    call_id = id,
                    avatars = state.avatar!!,
                    background = state.image_card!!
                )
                Row {
                    InfoCard(
                        title = stringResource(id = R.string.time),
//                    body = state.task_minutes!!,
                        body = "2-3 min",
                        img = R.drawable.alarm)
                    InfoCard(
                        title = stringResource(id = R.string.period),
                        body = state.frequence!!,
                        img = R.drawable.calendar
                    )
                }
                AchiveCard(text = state.skip_days!!, img = state.achive_win!!)

//            Text(text = )
                TripleColorsButton(
                    shape = RoundedCornerShape(20.dp),
                    width = 335.dp,
                    height = 65.dp,
                    onClick1 = { /*TODO*/ },
                    onClick2 = { /*TODO*/ },
                    text_c1 = stringResource(id = R.string.accept_call),
                    text_c2 = stringResource(id = R.string.accept_call),
                    text_c3 = stringResource(id = R.string.accept_call),
                    isLogged = true,
                    isDone = true
                )
                /*
                Block with video content !
                 */

                AboutCall()
            }
        }
    )

}