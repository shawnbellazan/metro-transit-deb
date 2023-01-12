package com.tooensure.transit.metro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.tooensure.transit.metro.screens.HomeScreen
import com.tooensure.transit.metro.screens.TicketDetailScreen
import com.tooensure.transit.metro.screens.TicketScreen
import com.tooensure.transit.metro.types.ScreenNavType

@Composable
fun GoToNavigation()
{
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenNavType.HomeScreen.name) {
        composable(ScreenNavType.HomeScreen.name) {
            // Go to Home Screen
            HomeScreen(
                navController = navController)
        }
        composable(ScreenNavType.TicketScreen.name) {
            // Go to Home Screen
            TicketScreen(
                navController = navController)
        }
        composable(ScreenNavType.TicketDetail.name + "/{id}",
            arguments = listOf(
                navArgument(name = "id") {
                    type = NavType.StringType
                }
            ))
        {   backStack ->
            TicketDetailScreen(
                navController = navController,
                key = backStack.arguments?.getString("id")
            )
        }


    }
}