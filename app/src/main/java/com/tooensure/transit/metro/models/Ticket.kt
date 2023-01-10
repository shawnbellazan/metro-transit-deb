package com.tooensure.transit.metro.models

data class Ticket(
    val id : String,
    val gif : String,
    val isActive : Boolean = true,
    val expireInMinutes : String
)

fun getTickets() : List<Ticket>
{
 return listOf(
    Ticket(
        id = "1",
        gif = ".gif",
        expireInMinutes = "230"
    ),
     Ticket(
         id = "2",
         gif = ".gif",
         isActive = false,
         expireInMinutes = "230"
     )
 )
}