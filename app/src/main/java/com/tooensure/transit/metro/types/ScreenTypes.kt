package com.tooensure.transit.metro.types

import java.lang.IllegalArgumentException

enum class ScreenNavType {
    HomeScreen,
    TicketScreen,
    TicketDetail;

    companion object {
        fun fromRoute(route: String?): ScreenNavType =
            when (route?.substringBefore("/")) {
                HomeScreen.name -> HomeScreen
                TicketScreen.name -> TicketScreen
                TicketDetail.name -> TicketDetail
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
    }
}