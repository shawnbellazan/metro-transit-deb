@file:OptIn(ExperimentalMaterial3Api::class)

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tooensure.transit.metro.widgets.BusinessCard

@Composable
fun BuyTicketScreen(
    navController: NavController
) { OnBuyTicketScreen() }


@Preview
@Composable
fun OnBuyTicketScreen() {

    Text(text = "Credit Card Information")

}
