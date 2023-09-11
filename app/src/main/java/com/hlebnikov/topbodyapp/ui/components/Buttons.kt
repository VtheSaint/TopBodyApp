package com.hlebnikov.topbodyapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import com.hlebnikov.topbodyapp.ui.theme.AppTheme

@Composable
fun RoundButton(shape: Shape, color: Color, width: Dp, height: Dp, onClick: () -> Unit, text: String) {
    Button(
        onClick = onClick,
        shape = shape,
        modifier = Modifier
            .width(width)
            .height(height)
            .background(color)
    ) {
        text
    }
}


@Composable
fun TripleColorsButton(
    shape: Shape,
    width: Dp,
    height: Dp,
//    onClick1: () -> Unit,
//    onClick2: () -> Unit,
    text_c1: String,
    text_c2: String,
    text_c3: String,
    isLogged: Boolean,
    isDone: Boolean,
    modifier: Modifier = Modifier,
    navController: NavController,
    id: Number
) {
    if (!isLogged)  {
        Button(
            onClick = {
                navController.navigate("Login")
//                println(onClick1)
//                onClick1()
            },
            shape = shape,
            modifier = Modifier
                .width(width)
                .height(height),
            colors = ButtonDefaults.buttonColors(containerColor = AppTheme.colors.NightSky)

        ) {
            println("IsLogged equal false")
            Text(text = text_c1)
        }
    }
    else {
        if (!isDone) {
            Button(
                onClick = {navController.navigate("CallInfo/${id}")},
                shape = shape,
                modifier = Modifier
                    .width(width)
                    .height(height),
                colors = ButtonDefaults.buttonColors(containerColor = AppTheme.colors.OrangeJuice)

            ) {
                println("IsDone equal false ")
                Text(text = text_c2)
            }
        }

        else {
            Button(
                onClick = {navController.navigate("CallInfo/${id}")},
                shape = shape,
                modifier = Modifier
                    .width(width)
                    .height(height),
                colors = ButtonDefaults.buttonColors(containerColor = AppTheme.colors.Green)

            ) {
                println("All is true")
                Text(text = text_c3)
            }
        }
    }
}