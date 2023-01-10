package com.tooensure.transit.metro.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TicketDetailScreen(
    navController: NavController,
) { TicketDetailBody() }

@Composable
fun TicketDetailBody() {
    TicketDetailTheme {

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TicketDetailTheme(content: @Composable () -> Unit) {
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
