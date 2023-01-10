package com.tooensure.transit.metro.screens

import androidx.compose.material3.MaterialTheme

enum class GoToScreen {
    HomeScreen,
    TicketScreen;

    companion object {
        fun fromRoute(route: String?): GoToScreen =
            when (route?.substringBefore("/")) {
                HomeScreen.name -> HomeScreen
                TicketScreen.name -> TicketScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
    }











//    HomeScreen,
//    PaymentScreen,
//    GoToCardScreen,
//    // Goto CARD
//    ByIdGoToCardScreen,
//    CreateGoToCardScreen,
//    // Ticket
//    TicketDetailScreen
}