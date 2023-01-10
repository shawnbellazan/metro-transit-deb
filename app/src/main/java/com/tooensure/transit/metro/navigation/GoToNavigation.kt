package com.tooensure.transit.metro.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tooensure.transit.metro.screens.BuyTicketScreen
import com.tooensure.transit.metro.screens.GoToScreen
import com.tooensure.transit.metro.screens.HomeScreen
import com.tooensure.transit.metro.screens.TicketScreen

@Composable
fun GoToNavigation()
{
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = GoToScreen.HomeScreen.name) {
        composable(GoToScreen.HomeScreen.name) {
            // Go to Home Screen
            HomeScreen(
                navController = navController)
        }

        composable(GoToScreen.TicketScreen.name) {
            // Go to Home Screen
            TicketScreen(
                navController = navController)
        }
    }
}