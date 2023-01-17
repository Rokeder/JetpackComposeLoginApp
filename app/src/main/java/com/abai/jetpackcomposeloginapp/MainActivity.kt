package com.abai.jetpackcomposeloginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.abai.jetpackcomposeloginapp.ui.theme.JetpackComposeLoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var fieldText by remember {
                mutableStateOf("")
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier.background(Color.Red)) {
                    TextField(value = fieldText, onValueChange = { value ->
                        fieldText = value
                    })
                }
                Box(modifier = Modifier.fillMaxWidth().)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeLoginAppTheme {
        Greeting("Android")
    }
}