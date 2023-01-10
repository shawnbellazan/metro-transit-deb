package com.tooensure.transit.metro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tooensure.transit.metro.ui.theme.MetroTransitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoToApp()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoToApp(content: @Composable () -> Unit = { })
{
    MetroTransitTheme {
        // Scaffold
        Scaffold(
            topBar = {
                Surface() {
                    // NavSurface()
                }
            }
        ) { x ->
            Box(modifier = Modifier.padding(x))
            {
                content()
            }
        }
    }
}

@Composable
fun MainView(
    name: String) {
    Surface(Modifier.fillMaxSize()) {
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
                text = "$name",
                modifier = Modifier,
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   GoToApp {
    MainView(name = "Metro Transit")
   }
}