package com.hlebnikov.topbodyapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import coil.compose.AsyncImage
import com.hlebnikov.topbodyapp.ui.theme.AppTheme


@Composable
fun Avatar(img_url: String, modifier: Modifier) {
    AsyncImage(
        model = img_url,
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,            // crop the image if it's not a square
        modifier = modifier.run {
            size(64.dp)
                .clip(CircleShape)                       // clip to the circle shape
                .border(2.dp, AppTheme.colors.Green, CircleShape)
        }
    )

}

@Composable
fun OverlappingAvatarRow(avatars: Array<String>) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        for (i in avatars.indices) {
            val modifier = Modifier.offset(
                x = (i * (-20).dp),
                y = (i * 20.dp)
            )
            Avatar(img_url = avatars[i], modifier = modifier)
        }
    }
}
