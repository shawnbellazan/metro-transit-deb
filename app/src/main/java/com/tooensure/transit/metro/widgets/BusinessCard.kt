package com.tooensure.transit.metro.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun BusinessCard(
    companyName: String = "Company-Name",
    onClicked : (String) -> Unit = { }
) {
    Surface(Modifier
        .fillMaxSize()
        .clickable {
            onClicked(companyName)
        }) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hello",
                modifier = Modifier,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = "$companyName",
                modifier = Modifier,
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}