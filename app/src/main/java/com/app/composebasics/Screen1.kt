package com.app.composebasics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.composebasics.ui.theme.ComposeBasicsTheme

@Composable
fun Screen1(
    onGoToNextScreen: () -> Unit
) {
    ComposeBasicsTheme{
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Screen 1", fontSize = 24.sp)

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    onGoToNextScreen()
                }
            ) {
                Text(text = "Go To Screen 2", fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen1Preview(){
    Screen1(onGoToNextScreen = {})
}
