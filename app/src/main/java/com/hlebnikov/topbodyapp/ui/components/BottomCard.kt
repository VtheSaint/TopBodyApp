package com.hlebnikov.topbodyapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hlebnikov.topbodyapp.R

@Composable
fun BottomCard(
    onClick: () -> Unit = {},
) {
    Card (
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .clickable { onClick }
            .padding(start = 7.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.bottom_card),
            contentDescription = null,
            modifier = Modifier.height(200.dp).width(335.dp)
        )
//        Column {
//            Text(text = stringResource(id = R.string.bottom_title))
//            RoundButton(
//                shape = RoundedCornerShape(20.dp),
//                color = AppTheme.colors.OrangeJuice,
//                width = 135.dp,
//                height = 35.dp,
//                onClick = { /*TODO*/ },
//                text = stringResource(id = R.string.look)
//            )
//        }
    }
}

