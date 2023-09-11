package com.hlebnikov.topbodyapp.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.hlebnikov.topbodyapp.ui.theme.AppTheme

@Composable
fun AchiveCard(
    text: Number,
    img: String
) {
    val body = "Не более $text дней пропуска \u2028за период вызова"
    Row {
        AsyncImage(model = img, contentDescription = null)
        Text(
            text = body,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
//                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(600),
                color = AppTheme.colors.NightSky,
            )
        )
    }
}