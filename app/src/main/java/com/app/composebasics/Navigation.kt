package com.app.composebasics

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(modifier = modifier, navController = navController, startDestination = Screen.Screen1) {

        composable<Screen.Screen1> {
            Screen1(onGoToNextScreen = {
                navController.navigate(Screen.Screen2(8))
            })
        }

        composable<Screen.Screen2> {
            val screen2: Screen.Screen2 = it.toRoute()
            Screen2(screen2.id, onGoToNextScreen = {
                navController.popBackStack()
                navController.navigate(Screen.Screen3)
            })
        }

        composable<Screen.Screen3> {
            Screen3(onGoBack = {
                navController.popBackStack()
            })
        }
    }
}