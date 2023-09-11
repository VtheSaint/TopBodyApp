package com.hlebnikov.topbodyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hlebnikov.topbodyapp.R
import com.hlebnikov.topbodyapp.ui.theme.AppTheme

@Composable
fun AboutCall() {
    Column {
        Text(
            text = stringResource(id = R.string.about_call),
            style = TextStyle(
                fontSize = 22.sp,
                lineHeight = 30.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(700),
                color = AppTheme.colors.NightSky,
            )
        )

        BottomCard()


        Column(
            modifier = Modifier
                .background(color = AppTheme.colors.Mouse, shape = RoundedCornerShape(size = 20.dp))
                .padding(start = 22.dp, top = 22.dp, end = 22.dp, bottom = 22.dp)
        ) {
            Text(
                text = stringResource(id = R.string.service_rules_title),
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(700),
                    color = AppTheme.colors.NightSky,
                )
            )
            Text(
                text = stringResource(id = R.string.rule_1),
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = AppTheme.colors.DarkGrey,
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(id = R.string.rule_2),
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = AppTheme.colors.DarkGrey,
                )
            )
        }
    }
}