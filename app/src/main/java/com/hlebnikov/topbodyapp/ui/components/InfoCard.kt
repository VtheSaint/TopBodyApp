package com.hlebnikov.topbodyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlebnikov.topbodyapp.ui.theme.AppTheme



// TODO Add Icon Support
@Composable
fun InfoCard(
    title: String,
    body: String,
    img: Int
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(18.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
//            .width(163.dp)
//            .height(118.dp)
            .background(color = Color(0xFFE9F5FA), shape = RoundedCornerShape(size = 20.dp))
            .padding(start = 22.dp, top = 18.dp, end = 22.dp, bottom = 18.dp),
    ) {
        Row {
//            AsyncImage(model = img, contentDescription = null)
            Icon(painter = painterResource(id = img), contentDescription = null)
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
//                    fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(600),
                    color = AppTheme.colors.NightSky,
                    textAlign = TextAlign.Center,
                )
            )
        }
        Text(
            text = body,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(700),
                color = AppTheme.colors.NightSky,
            )
        )
    }

}

