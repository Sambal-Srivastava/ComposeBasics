package com.app.composebasics

import androidx.compose.foundation.layout.Arrangement
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

@Composable
fun Screen3(
    onGoBack: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen 3", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                onGoBack()
            }
        ) {
            Text(text = "Go Back", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen3Preview(){
    Screen3(onGoBack = {})
}