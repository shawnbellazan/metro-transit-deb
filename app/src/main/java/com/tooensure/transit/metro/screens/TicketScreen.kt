package com.tooensure.transit.metro.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tooensure.transit.metro.models.Ticket
import com.tooensure.transit.metro.models.getTickets

@Composable
fun TicketScreen(
    navController: NavController,
) { TicketList() }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TicketTheme(
    content : @Composable () -> Unit = { }
)
{
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.onBackground,
        topBar = {
            Surface(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth(),
                color = MaterialTheme.colorScheme.primary
            ) {
                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Row() {
                        Text(text = "Tickets")
                    }
                }
            }
        },
        bottomBar = {
            // apply bottom
            }
    ) { contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)) {
            content()
        }
    }
}


@Preview
@Composable
fun TicketList(
    tickets: List<Ticket> = getTickets()
) {
    TicketTheme() {
        LazyColumn {
            items(items = tickets) { ticket ->
                TicketRow(
                    ticket = ticket
                )
                {
                    Log.d("Ticket Pressed","Navigate to ticket detail")
                    //if (ticket.isActive)  else ,
                }
            }
        }
    }


}

@Preview
@Composable
fun TicketRow(
    isActive: Boolean = true,
    ticket: Ticket = getTickets()[0],
    onItemClicked : (String) -> Unit = { }
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = if (ticket.isActive) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.primary,
        contentColor = if (ticket.isActive) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onPrimary,
        shape = RoundedCornerShape(corner = CornerSize(0.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .height(60.dp),
            verticalAlignment = Alignment.CenterVertically) {

            Text(
                modifier = Modifier,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Start,
                text = "Ticket")

            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End,
                text = if (ticket.isActive) "active" else "- 1.00 $"
            )

        }

    }
}
