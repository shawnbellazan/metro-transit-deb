@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class
)

package com.tooensure.transit.metro.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tooensure.transit.metro.types.ScreenNavType
import com.tooensure.transit.metro.ui.theme.MetroTransitTheme
import com.tooensure.transit.metro.widgets.BusinessCard
import com.tooensure.transit.metro.widgets.RoundIconButton


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreen(
    navController: NavController? = null
) {
    MetroTransitTheme() {
        Scaffold(
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { navController?.navigate(ScreenNavType.TicketScreen.name) })
                {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Go to list of Tickets")
                }
            },
        ) { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {

            }
        }
    }
}

@Composable
fun HomeScreenBottomBar(
    navController: NavController
)
{
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
    ) {
        Surface(

        ) {
            RoundIconButton() {
                navController.navigate(ScreenNavType.TicketScreen.name)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OnHomeScreen(
    navController: NavController
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
                        Text(text = "Top")
                    }
                }
            }
        },
        bottomBar = {
            HomeScreenBottomBar(
                navController = navController)
        }
    ) { contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)) {
            Text(text = "I'm on Home Screen")
        }
    }
}