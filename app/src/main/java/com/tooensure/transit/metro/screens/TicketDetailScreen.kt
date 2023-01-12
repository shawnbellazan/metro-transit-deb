package com.tooensure.transit.metro.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.tooensure.transit.metro.ui.theme.MetroTransitTheme
import org.w3c.dom.Text


@Composable
fun TicketDetailScreen(
    key: String? = null,
    navController: NavController
)
{
    MetroTransitTheme() {
        TicketDetail(navController = navController)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TicketDetail(
    navController: NavController
)
{
    val topAppBarElementColor = MaterialTheme.colorScheme.onPrimary

    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.clickable {
                    navController.popBackStack()
                },
                title = { Text(text = "Ticket") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    scrolledContainerColor = MaterialTheme.colorScheme.surface,
                    navigationIconContentColor = topAppBarElementColor,
                    titleContentColor = topAppBarElementColor,
                    actionIconContentColor= topAppBarElementColor,
                ),
            )
        }
    ) { cp ->
        Box(modifier = Modifier.padding(cp))
        {
            Text(text = "Inside the box")
        }

    }
}
