package com.hlebnikov.topbodyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.hlebnikov.topbodyapp.R
import com.hlebnikov.topbodyapp.ui.theme.AppTheme

@Composable
fun CallCard(
    title: String,
    isLogged: Boolean,
    isDone: Boolean,
    call_id: Number,
    avatars: Array<String>,
    background: String,
    navController: NavController
//    onClick1: Unit,
//    onClick2: Unit,

) {
    Card(
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(){
//            AsyncImage(
//                model = background,
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.matchParentSize()
//                )
            Column (
                modifier = Modifier
                    .padding(start = 22.dp)
                    .background(Color.Transparent)
            ) {
                Text(
                    text = title,
                    modifier = Modifier.padding(top = 22.dp),
                    style = TextStyle(
                        fontSize = 26.sp,
                        lineHeight = 32.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(700),
                        color = AppTheme.colors.NightSky,
                    )
                )
                Column(modifier = Modifier.padding(top = 30.dp, bottom = 30.dp)) {
                    Text(
                        text = stringResource(id = R.string.accept_call),
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
//                    fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(600),
                            color = AppTheme.colors.NightSky,
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier.padding(bottom = 11.dp)
                    )
                    Row {
                        OverlappingAvatarRow(avatars = avatars)
                    }

                }

                TripleColorsButton(
                    shape = RoundedCornerShape(20.dp),
                    width = 300.dp,
                    height = 50.dp,
//                    onClick1 = {
//                        onClick1
//                    },
//                    onClick2 = {
//                        onClick2
//                    },
                    text_c1 = stringResource(id = R.string.more_about_call),
                    text_c2 = stringResource(id = R.string.complete_exercise),
                    text_c3 = stringResource(id = R.string.success_call),
                    isLogged = isLogged,
                    isDone = isDone,
                    navController = navController,
                    id = call_id
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }

}




@Composable
fun CallCardWithoutButton(
    title: String,
//    navController: NavController,
    call_id: Number,
    avatars: Array<String>,
    background: String
) {
    Card(
        shape = RoundedCornerShape(20.dp)
    ) {
        AsyncImage(model = background, contentDescription = null)
        Column (
            modifier = Modifier
                .padding(start = 22.dp)
        ) {
            Text(
                text = title,
                modifier = Modifier.padding(top = 22.dp),
                style = TextStyle(
                    fontSize = 26.sp,
                    lineHeight = 32.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(700),
                    color = AppTheme.colors.NightSky,
                )
            )
            Column(modifier = Modifier.padding(top = 30.dp)) {
                Text(
                    text = stringResource(id = R.string.accept_call),
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 18.sp,
//                    fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(600),
                        color = AppTheme.colors.NightSky,
                        textAlign = TextAlign.Center,
                    )
                )
                Row {
                    OverlappingAvatarRow(avatars = avatars)
                }

            }
        }
    }

}