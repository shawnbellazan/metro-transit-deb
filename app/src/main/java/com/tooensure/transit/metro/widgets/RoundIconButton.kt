package com.tooensure.transit.metro.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun RoundIconButton(
    onClick : () -> Unit = { }
)
{
    Surface(
        modifier = Modifier.padding(20.dp)
            .size(70.dp)
            .clickable { onClick() },
        shape = CircleShape,
        shadowElevation = 10.dp,
//        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
        color = MaterialTheme.colorScheme.primaryContainer
    ) {
        Icon(
            modifier = Modifier.padding(10.dp),
            imageVector = Icons.Default.Add,
            contentDescription = "Buy Ticket",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}