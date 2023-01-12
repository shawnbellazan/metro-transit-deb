package com.tooensure.transit.metro.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.tooensure.transit.metro.models.Ticket
import com.tooensure.transit.metro.models.getTickets
import com.tooensure.transit.metro.screens.TicketRow
import com.tooensure.transit.metro.types.ScreenNavType


@Preview
@Composable
fun TicketList(
    navController: NavController? = null,
    tickets: List<Ticket> = getTickets())
{
    LazyColumn {
        items(
            items = tickets,
        ) { ticket ->
            TicketRow(ticket = ticket)
            {ticket
                navController?.navigate(ScreenNavType.TicketDetail.name + "/${ticket.id}")
            }
        }
    }
}